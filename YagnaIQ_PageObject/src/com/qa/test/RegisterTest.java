package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.page.LoginPage;
import com.qa.page.RegistrationPage;

public class RegisterTest extends TestBase {

	LoginPage loginPage;
	RegistrationPage regpage;

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		regpage = new RegistrationPage();
	}

	@Test(priority = 1)
	public void registetrpagetest() {
		loginPage.clickToregister();
		String Tushar = "tushar", patil = "Patil", companyname = "Comppany";
		String emailid = "test@test.com"; 
		int mobno=1234567890;

		regpage.entername(Tushar, patil);
		regpage.company(companyname);
		regpage.emailid(emailid);
		regpage.mobileno();
		regpage.selecttnc();
		regpage.clickregister();
		
		

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
