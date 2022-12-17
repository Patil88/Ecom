package com.testLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageLayer.TransctionPage;
import com.testBase.TestBase;

public class PrintTransaction extends TestBase {
	@Test
	public void getTransection() throws InterruptedException, IOException
	{
		Thread.sleep(5000);

		trans.clickTransctionPage();
		Thread.sleep(3000);
		trans.getData();
		trans.enterdataExcel();
	}

}
