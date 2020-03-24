package com.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPOMLoginPage {
	WebDriver driver;
	
//	@FindBy(xpath="//a[@class=\"_3Ep39l\"]")
//	private WebElement login;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	private WebElement userid;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	private WebElement psw;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']") 
	private WebElement login2;
	
	@FindBy(xpath="//span[text()='Your username or password is incorrect']")
	private WebElement errormsg;
	
	
	
	
	public FlipkartPOMLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	public void login1()
//	{
//		login.click();
//	}
	
	public void userid1(String data)
	{
		userid.sendKeys(data);
	}
	
	public void psw1(String data)
	{
		psw.sendKeys(data);
	}
	public void login22()
	{
		login2.click();
	}
	public String Msgtext() {
		
		return 	errormsg.getText();
	}
	
	
	
	
	
	
	
	
	
	
	

}
