package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectmodel.RegiestrationPageobject;
import resources.BaseClass;

public class VerifyRegiestrationTestCases  extends BaseClass{
	@Test
	public void VerifyRegiestrationWithValidData() throws IOException {
		driverInitilization();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		RegiestrationPageobject rpo=new RegiestrationPageobject(driver);
		rpo.ClickonmyAccount().click();
		rpo.Myregiestration().click();
		rpo.FirstName().sendKeys("test");
		rpo.LastName().sendKeys("case");
		rpo.Email().sendKeys(email);
		rpo.TelephoneNo().sendKeys("1212121212");
		rpo.Password().sendKeys("secure");
		rpo.ConfirmPassword().sendKeys("secure");
		rpo.ClickOnPolicy().click();
		rpo.ClickOnContinue().click();
		
//		assertion
//		assertEquals(actual result, expected result)
//		SoftAssert sa=new SoftAssert();
//		sa.assertEquals(0, 0);
		
		
		
	}	

}
