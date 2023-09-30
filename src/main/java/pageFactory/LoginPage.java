package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LoginPage extends BasePage{
	public WebDriver driver;
	
	//By Locators
	
	private By btnX = By.xpath("//span[@class='_30XB9F']");
	
	
	// Page class constructor
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	
	//pageActions
	
	public String PageTitle() {
		return driver.getTitle();
	}
	
	public void clickX() {
		driver.findElement(btnX).click();
	}
	

}
