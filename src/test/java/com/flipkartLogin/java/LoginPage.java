package com.flipkartLogin.java;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.flipkart.BaseLib11;
import com.flipkart.FlipkartHomepage;
import com.flipkart.FlipkartPOMLoginPage;
import com.flipkart.GenericLib11;

public class LoginPage extends BaseLib11 {
	
//	@Test
//	public void Tc_01() {
//	
//	FlipkartPOMLoginPage FPL =new FlipkartPOMLoginPage(driver);   
//	
//	FPL.userid1(GenericLib11.getCellNumData("sheet1", 3, 4));
//	FPL.psw1(GenericLib11.getExcelData("sheet1", 4, 4));
//	FPL.login22();
//	Assert.assertEquals(FPL.Msgtext(), GenericLib11.getExpectedData("sheet1", 5, 5));
//	}
//	
//	@Test
//	public void Tc_02() throws InterruptedException {
//		
//	FlipkartPOMLoginPage FPL =new FlipkartPOMLoginPage(driver);	
//
//	FPL.userid1(GenericLib11.getCellNumData("sheet1", 6, 4));
//	FPL.psw1(GenericLib11.getExcelData("sheet1", 7, 4));
//	FPL.login22();
//	Thread.sleep(10000);
//	
//	
//	 }
	
	@Test
	public void TC_03() {
		
	//FlipkartPOMLoginPage FPL =new FlipkartPOMLoginPage(driver);
	
	FlipkartHomepage FH =new FlipkartHomepage(driver);
	Assert.assertEquals(FH.homepagetitle(), GenericLib11.getExpectedData("sheet1", 10, 5));
	}
	
	
}
