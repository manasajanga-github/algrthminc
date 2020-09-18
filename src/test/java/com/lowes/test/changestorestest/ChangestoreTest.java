package com.lowes.test.changestorestest;




import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lowes.enums.BrowserTypes;
import com.lowes.managers.WebDriverManager;
import com.lowes.pages.BasePage;
import com.lowes.pages.ChangeStore;
import com.lowes.pages.HomePage;
import com.lowes.test.basetest.BaseTest;


public class ChangestoreTest extends BaseTest 
{
	@BeforeClass
	public void beforemethod() throws Exception
	{
		driver=WebDriverManager.launchDriver(BrowserTypes.CHROME);
		HomePage homepage=new HomePage(driver);
		homepage.goToHomePage().goTochangestore();
	}
	
	@Test
	public void changelocation() throws Exception
	{
		ChangeStore changestore=new ChangeStore(driver);
		changestore.entertext();
		changestore.clicksearch();
		changestore.clickmakethisstore();
		changestore.newlocation();
	}
	

}
