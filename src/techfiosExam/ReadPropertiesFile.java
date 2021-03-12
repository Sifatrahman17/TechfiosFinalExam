package techfiosExam;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\sifat\\eclipse-workspace\\august2020\\August2020Selenium\\FinalTakeHomeExam\\data\\read.properties";
		

		if (doesfileExist(filePath)) {
			System.out.println("File Exists");
			Properties prop = new Properties();
			FileInputStream fs = null;

			try {

				fs = new FileInputStream(filePath);

			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("Apple: " + prop.getProperty("Apple"));
			System.out.println("Table: " + prop.getProperty("Table"));
			System.out.println("Orange: " + prop.getProperty("Orange"));

		} else {
			System.out.println("File does'nt Exist");
		}

	}

	private static boolean doesfileExist(String filePath) {
		return true;
	}

}
