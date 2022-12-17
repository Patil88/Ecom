package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;
public class LoginPage extends TestBase
{

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//========OBJ Repo=====
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txtbox;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txtbox;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	private WebElement login_btn;
	
	
	//=======Actions Methods===
	

	public void logintxtBox()
	{
		email_txtbox.sendKeys("omkarpharate15@gmail.com");
	}
	
	public void passwordtxtBox()
	{
		password_txtbox.sendKeys("8888908823");
		
	}
	public void loginbtnClick()
	{
		login_btn.click();
		
	}
	
}

