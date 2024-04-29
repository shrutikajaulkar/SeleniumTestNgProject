package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectmodel.Loginpageobject;
import resources.BaseClass;

public class VerifyLoginTestCases extends BaseClass {
	@Test
	public void verifyLoginwithvalidData() throws IOException, InterruptedException {
		driverInitilization();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Loginpageobject lpo = new Loginpageobject(driver);
		Thread.sleep(2000);
		lpo.enterEmail().sendKeys("shruti23@gmail.com");
		lpo.enterPassword().sendKeys("secure");
		lpo.clickonLogin().click();

	}

}
