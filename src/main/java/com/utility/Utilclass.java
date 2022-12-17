package com.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class Utilclass extends TestBase{

	public Utilclass()
	{
	PageFactory.initElements(driver, this);	
	}
	 public String verifyUrl()
	 {
		 String current_url=driver.getCurrentUrl();
		 return current_url;
	 }
	 
	 static String path="D:\\eclipseworkspace\\newWorkspace\\MyDalal\\Screenshots\\";
	 public static void screenshot(String filename) throws IOException
	 {
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File target=new File(path+filename+System.currentTimeMillis()+".png");
		 FileHandler.copy(src, target);
		 
	 }
	 
	
	
	
}
