package com.flipkart;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericLib11 {
	
	public static String getExcelData(String sheet,int row,int col) {
		String data=null;
		try {
		FileInputStream fin =new java.io.FileInputStream("D:\\Eclipse Workpsace\\Flipkart\\src\\test\\resources\\FlipkartSheet.xlsx");
		Workbook workbook=WorkbookFactory.create(fin);
		Sheet sht=workbook.getSheet(sheet);
		Cell cell=sht.getRow(row).getCell(col);
		 data = cell.getStringCellValue();
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
		return data ;
		
	}
	
	public static String getExpectedData(String sheet,int row,int col) {
		String data = getExcelData(sheet,row,col);
		String eData[]=data.split("-");
		return eData[0];
	}
	
	public static String getCellNumData(String sheet,int row,int col)
	{
		String data=null;
		try {
			FileInputStream fin=new FileInputStream("D:\\Eclipse Workpsace\\Flipkart\\src\\test\\resources\\FlipkartSheet.xlsx");
			Workbook workbook=WorkbookFactory.create(fin);
			Sheet sht=workbook.getSheet(sheet);
			Cell cl=sht.getRow(row).getCell(col);
			data=String.valueOf((long)cl.getNumericCellValue());
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return data;
		
				
	}
	
	
	public static void takess(WebDriver driver,String name) {
		try {
	TakesScreenshot ts=(TakesScreenshot)driver;
	Object outputType;
	File src=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("D:\\Eclipse Workpsace\\Flipkart\\SOFTWARES\\Screenshot"+name+".png"));
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		}
	}











