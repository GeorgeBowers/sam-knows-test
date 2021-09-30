package group.sam_knows_test.testing;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TestUtils {
	
    public static String loadResource(final String filename) throws URISyntaxException, IOException {
        return Files.readString(Paths.get(TestUtils.class.getClassLoader().getResource(filename).toURI()));
    }

}
