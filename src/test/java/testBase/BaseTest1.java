package testBase;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.BasePage;
import pageFactory.LoginPage;
import pageFactory.TotalLinks;

public class BaseTest1 extends BasePage {
/*	public BasePage basePage;
	public LoginPage loginPage;
	public TotalLinks totalLinks;
	public WebDriver driver;
	public Properties prop;
	
	public Logger logger; // for logging
	
	@BeforeMethod
	public void setUp(){
		
		logger=LogManager.getLogger(this.getClass());  //logging
		
		basePage = new BasePage();
		prop= basePage.init_prop();
		String Browser = prop.getProperty("browser");
		driver = basePage.init_driver(Browser);
		loginPage = new LoginPage(driver);
		totalLinks = new TotalLinks(driver);
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/
}
