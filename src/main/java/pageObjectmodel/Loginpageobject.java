package pageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageobject {
	public WebDriver driver;
//	set
	private By email = By.xpath("//input[@id='input-email']");
	private By password = By.xpath("//input[@id='input-password']");
	private By login = By.xpath("//input[@value='Login']");

public Loginpageobject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	
	}
	//	get
	public WebElement enterEmail() {
		return driver.findElement(email);

	}
	public WebElement enterPassword() {
		return driver.findElement(password);

	}
	public WebElement clickonLogin() {
		return driver.findElement(login);

	}
	

}
