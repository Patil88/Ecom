package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class ExchangeBUYsell extends TestBase {

	public ExchangeBUYsell() {
		PageFactory.initElements(driver, this);

	}

	////// obj repo buy share/////
	private By buy_btn1 = By.xpath("(//li[@class='nav-item'])[1]");
	private By enter_quantity = By.xpath("//input[@name='input-Qunatity']");
	private By buy_btn2 = By.xpath("//button[@class='w-md btn btn-success']");
	private By verify_statusMsg = By.xpath("(//div[text()='Order Created successfully'])[1]");
	///

	///// obj repo selling share
	@FindBy(xpath = "//a[normalize-space()='Sell']")
	private WebElement sell;
	private By quantity = By.xpath("//input[@id='quantity']");
	@FindBy(xpath = "//button[@class='w-md btn btn-danger']")
	private WebElement sellBtn;
	@FindBy(xpath = "(//div[text()='Order Created successfully'])[1]")
	private WebElement status_Msg;
	//// action methods selling share

	////// action methods buy share/////
	public void clickOnBuybtn1() {
		driver.findElement(buy_btn1).click();
		
	}

	public void enterQuantity(String count) {
		driver.findElement(enter_quantity).click();
		driver.findElement(enter_quantity).sendKeys(count);
	}

	public void clickOnBuybtn2() {
		driver.findElement(buy_btn2).click();
	}

	public String statusMsg() {
		String message = driver.findElement(verify_statusMsg).getText();
		return message;
	}
	//////action method sell share/////
	public void clickSell1()
	{
		sell.click();
	}
	public void quantityBtn(String count)
	{
		
		driver.findElement(quantity).click();
		driver.findElement(quantity).sendKeys(count);

	}
	public void sellBtn2()
	{
		sellBtn.click();
	}
	public String statusMsg1()
	{
		String act=status_Msg.getText();
		return act;
		
	}
	
	
	
	
	
	
	
	
	

}
