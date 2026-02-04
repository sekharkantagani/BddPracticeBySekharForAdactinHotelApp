package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class LoginPage extends BasePage {
	static WebDriver driver;
	
	public LoginPage() {
		super(driver=BaseTest.getDriver());
		
		addObject("usernameTextbox", By.xpath("//input[@name='username']"));
		addObject("passwordTextbox", By.xpath("//input[@name='password']"));
		addObject("loginButton", By.xpath("//input[@name='login']"));
	}
	
	

}
