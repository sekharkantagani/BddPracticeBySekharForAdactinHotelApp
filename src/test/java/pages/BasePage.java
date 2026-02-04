package pages;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class BasePage extends BaseTest {
	
	 WebDriver driver;
	 
	 Map<String, By> objectRepo=new HashMap<String,By>();
	
	public BasePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void addObject(String logicalName, By by) {
		
		objectRepo.put(logicalName,by);
	}
	
	public void type(String logicalName, String text) {
		//driver.findElement(By.xpath("")).sendKeys(text);
		
		getElement(logicalName).sendKeys(text);
	}

	public void click(String logicalName) {
		
		getElement(logicalName).click();
	}
	private WebElement getElement(String logicalName) {
		// TODO Auto-generated method stub
		
		By by=objectRepo.get(logicalName);
		
		waitForElementPresence(by);
		WebElement element=driver.findElement(by);
		
		
		return element;
		
		
	}

	private void waitForElementPresence(By by) {
		// TODO Auto-generated method stub
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(common.getProperty("explicitwait"))));
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		
		
		
	}
	public void validateTitle(String expTitle) {
		
		Assert.assertTrue(driver.getTitle().equals(expTitle));
		
	}

}

