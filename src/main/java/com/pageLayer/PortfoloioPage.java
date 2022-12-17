package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class PortfoloioPage extends TestBase {

	
	public PortfoloioPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	///////obj repo////
	
	@FindBy(xpath="//a[normalize-space()='Portfolio']")
	private WebElement portfolioBtn;
	@FindBy(xpath="(//a[@href='/exchange/nse/WIPRO.NS'])[2]")
	private WebElement tradeBTN;
	
	
	
	//////Action methods///////
	public void clickOnPortfolio()
	{
		portfolioBtn.click();
	}
	public void clickOnTrade()
	{
		tradeBTN.click();
	}
	
	
	
	
}
