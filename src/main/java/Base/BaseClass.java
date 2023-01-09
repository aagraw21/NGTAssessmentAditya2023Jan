package Base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

	public static String getUrl() throws Exception {
		FileReader reader = new FileReader(
				"C:\\Users\\aagraw21\\AssignmentWorkspace\\NGTAssessmentAditya2023Jan\\src\\main\\resources\\Properties\\application.properties");
		Properties props = new Properties();
		props.load(reader);
		String url = props.getProperty("url");
		return url;
	}

	public static String getPassword() throws Exception {
		FileReader reader = new FileReader(
				"C:\\Users\\aagraw21\\AssignmentWorkspace\\NGTAssessmentAditya2023Jan\\src\\main\\resources\\Properties\\application.properties");
		Properties props = new Properties();
		props.load(reader);
		String password = props.getProperty("password");
		return password;
	}
	
	public static String getEmail() throws Exception {
		FileReader reader = new FileReader(
				"C:\\Users\\aagraw21\\AssignmentWorkspace\\NGTAssessmentAditya2023Jan\\src\\main\\resources\\Properties\\application.properties");
		Properties props = new Properties();
		props.load(reader);
		String email = props.getProperty("email");
		return email;
	}
}
