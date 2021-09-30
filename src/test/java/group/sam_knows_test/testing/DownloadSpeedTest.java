package group.sam_knows_test.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import group.sam_knows_test.DownloadSpeed;

public class DownloadSpeedTest {
	
	@Test
	void itShouldDeserialize() throws URISyntaxException, IOException, ParseException {
		String jsonArray = TestUtils.loadResource("inputs/one-element.json");
	    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	    String toParse = "2018-01-29";
	    Date date = df.parse(toParse);

		DownloadSpeed expected = new DownloadSpeed(1.2f, date);
		
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setDateFormat(df);
	    TypeFactory typeFactory = mapper.getTypeFactory();
	    List<DownloadSpeed> someClassList = mapper.readValue(jsonArray, typeFactory.constructCollectionType(List.class, DownloadSpeed.class));

		assertEquals(expected, someClassList.get(0));
	}

}
