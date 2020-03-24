package com.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FlipkartHomepage {
	
	
	public FlipkartHomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	WebDriver driver;
	
	public String homepagetitle()
	{
		String data=driver.getTitle();
		return data;
	}

}
