package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.DashboardPage;
import com.pageLayer.ExchangeBUYsell;
import com.testBase.TestBase;

public class BuyShare extends TestBase{
@Test
	public void buyshare() throws InterruptedException
	{
	    String expected="Order Created successfully";
		Thread.sleep(3000);
		dash.enterCompanyName("reliance");
		Thread.sleep(3000);
		dash.selectCompanyOption();
		Thread.sleep(3000);
		exch.clickOnBuybtn1();
		exch.enterQuantity("2");
		exch.clickOnBuybtn2();
		exch.statusMsg();
		Thread.sleep(5000);
		//Assert.fail();
		Assert.assertEquals(exch.statusMsg(), expected);
		
	}
	
}
