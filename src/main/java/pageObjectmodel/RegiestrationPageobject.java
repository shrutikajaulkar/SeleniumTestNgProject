package pageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegiestrationPageobject {
	public WebDriver driver;
//	below all are set variable
	private By myAccount = By.xpath("//a[@title='My Account']");
	private By regiestration = By.xpath("//a[text()='Register']");
	private By firstName = By.xpath("//input[@id='input-firstname']");
	private By lastName = By.xpath("//input[@id='input-lastname']");
	private By email = By.xpath("//input[@id='input-email']");
	private By telephoneNo = By.xpath("//input[@id='input-telephone']");
	private By password = By.xpath("//input[@id='input-password']");
	private By confirmPassword = By.xpath("//input[@id='input-confirm']");
	private By clickonPolicy=By.xpath("//input[@type='checkbox']");
	private By  clickonContinue=By.xpath("//input[@type='submit']");
	
// we give scope here 
//	for that created constructor
public RegiestrationPageobject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}

	//	below all are get method 
	public WebElement ClickonmyAccount() {
		return driver.findElement(myAccount);
	}

	public WebElement Myregiestration() {
		return driver.findElement(regiestration);
	}

	public WebElement FirstName() {
		return driver.findElement(firstName);
	}

	public WebElement LastName() {
		return driver.findElement(lastName);
	}

	public WebElement Email() {
		return driver.findElement(email);
	}

	public WebElement TelephoneNo() {
		return driver.findElement(telephoneNo);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}

	public WebElement ConfirmPassword() {
		return driver.findElement(confirmPassword);
	}
	public WebElement ClickOnPolicy() {
		return driver.findElement(clickonPolicy);
	}
	public WebElement ClickOnContinue() {
		return driver.findElement(clickonContinue);
	}
	
}
