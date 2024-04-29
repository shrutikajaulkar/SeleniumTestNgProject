package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
public String email=generateRandomEmail();
//	add driver here bcz globally use 
	public WebDriver driver;

//	browser code 

	public void driverInitilization() throws IOException {

//	given path is of data.propertyies file
		FileInputStream fis = new FileInputStream(
				"F:\\Users\\USER\\AutomationTesting\\AutomationProject\\src\\main\\java\\resources\\data.properties");

//	 acces the data from properties file 
		Properties prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else
			System.out.println("plese add valid browser value");
	}
//	create this method for random email id (uniq email address)

	public static String generateRandomEmail() {
		return "abc" + System.currentTimeMillis() + "@gmail.com";

	}

}
