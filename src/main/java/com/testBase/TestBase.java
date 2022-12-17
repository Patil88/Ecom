package com.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pageLayer.DashboardPage;
import com.pageLayer.ExchangeBUYsell;
import com.pageLayer.LoginPage;
import com.pageLayer.PortfoloioPage;
import com.pageLayer.TransctionPage;
import com.utility.Utilclass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public PortfoloioPage port;
	public DashboardPage dash;
	public ExchangeBUYsell exch;
	public LoginPage logi;
	public TransctionPage trans;
	public Utilclass util;
	public Logger logger;
	
	@BeforeClass
	public void start()
	{
		logger=Logger.getLogger("Dalalstreet Framework");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Framework Execution started");
	}
	@AfterClass
	public void stop()
	{
		logger.info("Framework execution stopped");
	}
    @Parameters("browser")
	@BeforeMethod
	public void setUp(String br) throws InterruptedException {
	    //String br = "chrome";
		if (br.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (br.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (br.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		Thread.sleep(3000);
		logger.info("browser launched.");
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logger.info("Opened Url,maximized Browser,applied waits");
		// ================ Login Steps==========================
		LoginPage l = new LoginPage();
		l.logintxtBox();
		l.passwordtxtBox();
		l.loginbtnClick();

		// ================object creation of pagelayer classes=======================
		port = new PortfoloioPage();
		dash = new DashboardPage();
		exch = new ExchangeBUYsell();
		logi = new LoginPage();
		trans = new TransctionPage();
		util = new Utilclass();
	}

	@AfterMethod
	public void tearDown() {
//driver.quit();	
		logger.info("Browser closed");
	}
}
