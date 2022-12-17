package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.ExchangeBUYsell;
import com.pageLayer.PortfoloioPage;
import com.testBase.TestBase;

public class SellExchangePage extends TestBase {
	String exp = "Order Created successfully";

	@Test
	public void finallysell() throws InterruptedException {
		Thread.sleep(4000);

		port.clickOnPortfolio();
		Thread.sleep(4000);
		port.clickOnTrade();
		Thread.sleep(3000);

		exch.clickSell1();
		exch.quantityBtn("1");
		Thread.sleep(3000);

		exch.sellBtn2();
		Thread.sleep(3000);

		String Actual = exch.statusMsg();
		// Thread.sleep(1000);
		Assert.assertEquals(Actual, exp);
	}
}
