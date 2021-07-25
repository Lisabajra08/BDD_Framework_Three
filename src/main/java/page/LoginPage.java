package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage{
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Library of elements
		@FindBy(how = How.XPATH, using= "//input[@id='username']") 
		WebElement USERNAME_FIELD;
		@FindBy(how = How.XPATH, using= "//input[@id='password']") 
		WebElement PASSWORD_FIELD;
		@FindBy(how = How.XPATH, using= "//button[@name='login']") 
		WebElement LOGIN_FIELD;
		
		//Methods to interact with the elements 
		
		public void enterUsername(String userName) {
			USERNAME_FIELD.sendKeys(userName);
		}
		public void enterPassword(String passWord ) {
			PASSWORD_FIELD.sendKeys(passWord);
		}
		public void enterCredentials(String userName, String passWord) {
			USERNAME_FIELD.sendKeys(userName);
			PASSWORD_FIELD.sendKeys(passWord);
		}
		
		public void clickOnSigninButton() {
			 LOGIN_FIELD.click();
		}
		
		public String getpageTitle() {
			return driver.getTitle();
		}
		
		public String getCurrentURL() {
			return driver.getCurrentUrl();
		}
	}

