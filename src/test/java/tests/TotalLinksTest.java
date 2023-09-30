package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageFactory.TotalLinks;
import testBase.BaseTest;
import utils.Constants;
import utils.ExtentReportManager;

@Listeners(utils.ExtentReportManager.class)
public class TotalLinksTest extends BaseTest{
	
	@Test
	public void getLinks() {
		logger.debug("application logs......");
		logger.info("***  Starting TC_TotalLinks ***");
		TotalLinks tl = new TotalLinks(driver);
		tl.Links();
		
		logger.info("***  Finished TC_TotalLinks ***");	
	}
}
