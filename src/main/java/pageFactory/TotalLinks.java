package pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class TotalLinks extends BasePage {
	
public WebDriver driver;
	
	//By Locators
	
	//private By btnX = By.xpath("//span[@class='_30XB9F']");
	
	
	// Page class constructor
	
	public TotalLinks(WebDriver driver) {
		this.driver= driver;
		
	}


	//finding aal links on page
	public void Links() {
	
	List<WebElement> linksList = driver.findElements(By.tagName("a"));
	
	//print total links count
	int LinksCount = linksList.size();
	System.out.println("Total links:" +LinksCount);
	
	//print text of all links avoiding blank text
	
	//for
	/*for(int i=0; i<LinksCount; i++) {
		String text = linksList.get(i).getText();
		if(text.length()>0) {
			System.out.println(i + ":" + text);
		}
	}*/
	
	//for each 
	int count=0;
	for(WebElement e:linksList) {
		String text = e.getText();
		if(text.length()>0) {
			System.out.println(count + ":" + text);
		}
		count++;
	}
	
}
}
