package tests;

import org.testng.annotations.Test;

import pageFactory.TotalLinks;
import testBase.BaseTest;

public class bookMyShowTotalLinksTest extends BaseTest {

	@Test
	public void getLinks() {
		logger.debug("application logs......");
		logger.info("***  Starting TC_TotalLinks ***");
		TotalLinks tl = new TotalLinks(driver);
		tl.Links();
		
		logger.info("***  Finished TC_TotalLinks ***");	
	}
}
