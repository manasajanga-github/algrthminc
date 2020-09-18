package com.lowes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
	
	//*********Web Elements By Using Page Factory*********
    @FindBy(how = How.XPATH, using = "//img[starts-with(@id,'UIF-IMG')]")
    public WebElement feedbackImage;
    
    @FindBy(how=How.XPATH,using="//*[text()='Change Stores']")
    public WebElement changestore;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public HomePage goToHomePage() throws Exception {
		driver.get("https://www.lowes.ca/");
		Thread.sleep(5000);
		return this;
	}
	
	public FeedbackPage goToFeedbackPage() throws Exception {
		clickElement(feedbackImage, 10);
		switchToWindowByTitle("lowes.ca Study");
		return new FeedbackPage(driver);
	}
	
	public ChangeStore goTochangestore() throws Exception
	{
		clickElement(changestore, 5);
		return new ChangeStore(driver);
		
	}
	
	
	
}
