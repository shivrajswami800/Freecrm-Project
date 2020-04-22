package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() throws IOException
	{
		try
		{
		prop = new Properties();
		FileInputStream fis= new FileInputStream("E:\\Naven Practice\\FreeCrmTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(fis);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}


	public void initlaization()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwere\\Whole Setup\\chromedriver.exe");
		driver = new ChromeDriver();
		String ur = prop.getProperty("url");
		System.out.println(ur);
		driver.get(ur);
	}
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:/Softwere/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.contentEquals("FF"))
		{
			System.setProperty("webdriver.gecko.driver","D:/Softwere/chromedriver_win32/geckodriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		}*/
