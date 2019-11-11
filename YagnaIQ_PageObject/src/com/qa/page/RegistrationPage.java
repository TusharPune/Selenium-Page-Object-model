package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class RegistrationPage extends TestBase {

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtfname")
	WebElement firstname;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtlname")
	WebElement lastname;

	@FindBy(name = "ctl00$ContentPlaceHolder1$ddjobtitle")
	WebElement jobtitle;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtemail")
	WebElement email;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtphone")
	WebElement phone;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtcompany")
	WebElement company;

	@FindBy(name = "ctl00$ContentPlaceHolder1$ddemployee")
	WebElement employee;

	@FindBy(name = "ctl00$ContentPlaceHolder1$chktc")
	WebElement checkbox;

	@FindBy(name = "ctl00$ContentPlaceHolder1$btnsave")
	WebElement register;

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	public void entername(String first, String last) {
		firstname.sendKeys(first);
		lastname.sendKeys(last);
		
	}

	public void jobtitle() {
	}

	public void emailid(String emial) {
		email.sendKeys(emial);
	}

	public void mobileno() {
		
		phone.sendKeys("1234567890");
	}

	public void company(String cmpname) {
		company.sendKeys(cmpname);
	}

	public void selecttnc() {
		checkbox.click();
	}
	
	public void clickregister() {
		register.click();		
	}

}
