package com.qa.test;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.page.HomePage;
import com.qa.page.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest(){
//		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		
		
	}

	@Test(priority = 1)
	public void loginTest() {
		loginPage.clickonlogin();
//		homePage = loginPage.login("yagnaingramsingaporspuser1","Yagna123");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
