package steps;

import pages.BasePage;
import pages.DashboardPage;

import pages.LoginPage;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations extends BaseTest {
	
	BasePage page;
	
	@Before
	public void setUp() {
		
		if (driver == null) {
	        BaseTest.launchApplication();
	    }
	}
	@After
	public void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (driver != null) {
            driver.quit();
            driver = null;
        }
	}


	@Given("User starts browser")
	public void user_starts_browser() {
	    // browser already started in @Before
	}

	@Given("user launch the appliction using {string}")
	public void user_launch_the_appliction_using(String pageName) {
	    switch (pageName) {
	        case "LoginPage":
	            page = new LoginPage();
	            break;
	        case "DashboardPage":
	            page = new DashboardPage();
	            break;
	    }
	}

	@When("user enter text {string} in textbox using xpath {string}")
	public void user_enter_text_in_textbox_using_xpath(String value, String value1) {
	    page.type(value, value1);
	}

	@When("user click on login button using xpath {string}")
	public void user_click_on_login_button_using_xpath(String value) {
	    page.click(value);
	}

	
	@Then("user verify the title to be  {string}")
	public void user_verify_the_title_to_be(String title) {
		page.validateTitle(title);
	}

}
