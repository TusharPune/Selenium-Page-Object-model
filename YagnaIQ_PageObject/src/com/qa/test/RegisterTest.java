package com.qa.test;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.qa.util.TestUtil;
import com.qa.base.TestBase;
import com.qa.page.LoginPage;
import com.qa.page.RegistrationPage;

public class RegisterTest extends TestBase {

	LoginPage loginPage;
	TestUtil testUtil;
	RegistrationPage regpage;
	String sheetName = "Register";
	
	
	public RegisterTest(){
		super();
		
}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		regpage = new RegistrationPage();
		testUtil = new TestUtil();
	}
	
	
	
	
	
	@DataProvider
	public Object[][] getTestData() throws InvalidFormatException{
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	

	@Test(priority = 1, dataProvider = "getTestData")
	public void registetrpagetest(String fname, String lname, String comp,String eid, String Mno) {
		loginPage.clickToregister( );

		System.out.printf(fname, lname,comp,eid);
		regpage.entername(fname, lname);
		regpage.company(comp);
		regpage.emailid(eid);
		regpage.mobileno();
		regpage.selecttnc();
		regpage.clickregister();
	}

	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
