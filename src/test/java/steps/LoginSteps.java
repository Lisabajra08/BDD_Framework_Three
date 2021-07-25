package steps;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps {
	WebDriver driver;
	LoginPage loginPage;
	
	@Before
	public void beforeRun() {
		driver=BrowserFactory.init();
		loginPage=PageFactory.initElements(driver, LoginPage.class);	
	}
	@Given("^User is on the Techfios login page$")
	public void user_is_on_the_Techfios_login_page()  {
	   driver=BrowserFactory.init();
	   driver.get("https://techfios.com/billing/?ng=admin/");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username)  {
	    loginPage=PageFactory.initElements(driver, LoginPage.class);
	    loginPage.enterUsername(username);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}

	@When("^User clicks on SignIn button$")
	public void user_clicks_on_SignIn_button() {
		loginPage.clickOnSigninButton();
	    
	}
	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() {
		String expectedTitle= "Dashboard- iBilling";
		String actutalTitle= loginPage.getpageTitle();
		Assert.assertEquals("Wrong Page", expectedTitle, actutalTitle);
	    
	}
	@When ("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters(String username, String password) {
		loginPage.enterCredentials(username, password);
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
		
	}
}
