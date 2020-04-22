package com.crm.qa.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;



public class LoginTest extends TestBase 
{
	LoginPage log;
	WebDriver driver;

	
	public LoginTest() throws IOException
	{
		super();
	}
	
   @BeforeTest
   public void setup() throws IOException 
   {
	   initlaization();
	    log = new LoginPage();
   }
   
   @Test 
   public void loginPageTitleTest()
   {
	   String title = log.validateLoginpageTitle();
	   Assert.assertEquals(title, "CRMPRO  - CRM software for customer relationship management, sales, and support.");
	
   }
   
   @Test
   public void cmLogoImageTest()
   {
	   boolean flag = log.validateCrmImage();
	   Assert.assertTrue(flag);
   }
  
   @Test
   public void LoginTest()
   {
	   log.Login(prop.getProperty("username"), prop.getProperty("password"));  
   }
   
   
   
   /*@AfterMethod
   public void tearDown()
   {
	   driver.quit();
   }*/
   
   
	
  
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void setup()
	{
		initlaization();
		log = new LoginPage();
		
	}
	
	@Test
	public void Logintest()
	{
		log.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}	
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();  
	}*/

