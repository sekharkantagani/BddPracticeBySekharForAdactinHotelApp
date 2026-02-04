package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class DashboardPage extends BasePage{
	static WebDriver driver;
	public DashboardPage() {
		
		super(driver=BaseTest.getDriver());
		
		addObject("dashboardLabel", By.tagName("title"));
	}

}
