package com.qa.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {	

//		try {
//			prop = new Properties();
//			FileInputStream ip = new FileInputStream(System.getProperty("/home/tushar/repository/YagnaIQ_PageObject/src/com/qa/config/config.properties"));
//			prop.load(ip);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

		public static void initialization(){
//			String browserName = prop.getProperty("browser");
//			System.out.println("test");
			
			String browserName ="chrome"; 
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "/home/tushar/automation4 (1)/NewKeyWordDrivenFramework_TestNG/chromedriver");	
				driver = new ChromeDriver(); 
			}
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
				driver = new FirefoxDriver(); 
			}
				
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("http://www.crm360.co.in/");
			
			
	}
}
