package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.LoginPage;
import com.testBase.TestBase;
import com.utility.Utilclass;

public class LoginPageTest extends TestBase {
	String expUrl = "https://www.apps.dalalstreet.ai/dashboard";

	@Test
	public void verifyLoginpage() throws InterruptedException {
		logi.logintxtBox();
		logi.passwordtxtBox();
		logi.loginbtnClick();
		Thread.sleep(5000);

		String actUrl = util.verifyUrl();
		Thread.sleep(5000);
		Assert.assertEquals(actUrl, expUrl);
	}

}
