package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CommonUtilities.CommonUtilities;
import exceptions.InvalidBrowserException;

public class BaseTest {

	public static WebDriver driver;
	public static CommonUtilities common=new CommonUtilities();
	public static void launchApplication() {
		
		driver=BaseTest.getDriver();
		driver.get(common.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	public static WebDriver getDriver() {
		
		if(driver==null) {
			String browsername=common.getProperty("browser");
			
			switch (browsername) {
			case "chrome":
				driver=new ChromeDriver();
				break;
			case "firefox":
				driver=new FirefoxDriver();
				break;
			case "edge":
				driver=new EdgeDriver();
				break;
			default:
				try {
					throw new InvalidBrowserException();
				} catch (InvalidBrowserException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
				
			}
		}
		return driver;
	}
}
