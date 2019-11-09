package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
		
		//Page Factory - OR:
		@FindBy(name="userName")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;

		
		@FindBy(id="loginButtonFrontView")
		WebElement loginBtn; 
}
