package com.lowes.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ChangeStore extends BasePage 
{
	@FindBy(how = How.XPATH, using = "//button[text()='Change Stores']")
    public WebElement changestore;
    
	@FindBy(how= How.ID, using="find-store")
   public WebElement textsearch;	
	
	@FindBy(how= How.CLASS_NAME, using="icon-search")
	   public WebElement searchicon;	
	
	@FindBy(how= How.XPATH, using="//div[@role='group']//button[1]")
	   public WebElement makethismystore;
	
	@FindBy(how=How.XPATH,using="//span[text()='WHITBY']")
	public WebElement location;
	
	@FindBy(how=How.ID,using="changeStoreTitle")
	public WebElement windowtitle;
	
	public ChangeStore(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}
	
	
	public void entertext()
	{
		enterTextInElement(textsearch,"whitby",5);
	}
	
	public void clicksearch()
	{
		clickElement(searchicon,5);
	}
	
	public HomePage clickmakethisstore() throws Exception
	{
		clickElement(makethismystore,5);
		switchToWindowByTitle("Lowe's Canada - Home Improvement, Renovation & Hardware Store");
		return new HomePage(driver);
		
	}
	 public void newlocation()
	 {
		 location.isDisplayed();
		 
	 }
	
	}


