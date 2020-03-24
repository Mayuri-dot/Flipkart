package com.flipkart;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.annotations.*;


	public class BaseLib11 {
		static 
		{
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		}
		
		public WebDriver driver;
		
		@BeforeMethod
		public void setUp()
		{		
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("start-maximized");
			options.addArguments("incognito");
			
		    driver = new ChromeDriver(options);
		    
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   
		    driver.get("https://www.flipkart.com/");
			
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.close();
		}

	}



