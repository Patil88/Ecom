package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class DashboardPage extends TestBase {

	public DashboardPage() 
	{
		PageFactory.initElements(driver, this);
	}

	/////// obj repo
	private By search_box = By.xpath("//input[@class='form-control']");

	private By select_company = By.xpath("(//div[@class='m-2 card-title'])[2]");

	////// Action Methods
	public void enterCompanyName(String companyname) {
		driver.findElement(search_box).sendKeys(companyname);
	}

	public void selectCompanyOption() {
		driver.findElement(select_company).click();
	}
}
