package group.sam_knows_test.Model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class Model {
	
	private String folderLocation;
	

	public Model(String folderLocation) {
		this.folderLocation = folderLocation;
	}
	
	public List<DownloadSpeedData> readDataFromInputFiles() throws IOException {
		File path = new File(folderLocation);

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(df);
		TypeFactory typeFactory = mapper.getTypeFactory();

		for (File inputFile : path.listFiles()) {
			String downloadSpeedsString = Files.readString(inputFile.toPath());
			List<DownloadSpeed> downloadSpeedsList = mapper.readValue(downloadSpeedsString,
					typeFactory.constructCollectionType(List.class, DownloadSpeed.class));
		}

		return new ArrayList<>();
	}
	
}
