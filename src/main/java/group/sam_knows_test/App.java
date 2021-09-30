package group.sam_knows_test;

import group.sam_knows_test.Model.Model;
import group.sam_knows_test.controller.Controller;
import group.sam_knows_test.view.View;

public class App {

//	public static void main(String[] args) throws IOException {
//		File path = new File("outputs/");
//
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.setDateFormat(df);
//		TypeFactory typeFactory = mapper.getTypeFactory();
//
//		for (File inputFile : path.listFiles()) {
//			String downloadSpeedsString = Files.readString(inputFile.toPath());
//			List<DownloadSpeed> downloadSpeedsList = mapper.readValue(downloadSpeedsString,
//					typeFactory.constructCollectionType(List.class, DownloadSpeed.class));
//		}
//
//	}
	
	public static void main(String[] args) {
		Model model = new Model(args[0]);
		View view = new View();
		Controller controller = new Controller(model, view);
		controller.analyseInputFiles();
	}

}
