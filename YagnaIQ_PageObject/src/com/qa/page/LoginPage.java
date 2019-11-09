package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
		
		//Page Factory - OR:
		@FindBy(name="userName")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;

		
		@FindBy(id="loginButtonFrontView")
		WebElement loginBtn; 
		
		
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		
		public HomePage login(String un, String pass) {
			
			username.sendKeys(un);
			password.sendKeys(pass);
			loginBtn.click();
		
			return new HomePage(); 
		}
		
}
