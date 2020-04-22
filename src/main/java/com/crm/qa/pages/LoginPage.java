package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	//Page Factory Object Repository
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutton;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signup;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmlogo;
	
	
	public LoginPage() throws IOException
	{
		//Initlize the page factory by this method
		//super();
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateLoginpageTitle()
	{
		 return driver.getTitle();
	}
	
	public boolean validateCrmImage()
	   {
		return crmlogo.isDisplayed();
		   
	   }
	public HomePage Login(String un, String pwd)
	{ 
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		
		return new HomePage();
	}
	
}
