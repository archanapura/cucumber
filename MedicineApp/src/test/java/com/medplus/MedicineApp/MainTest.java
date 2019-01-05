package com.medplus.MedicineApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class MainTest
{
	WebDriver driver;
	@BeforeClass
	public void LaunchBrowser()
	{
		//System.setProperty("webdriver.gecko.driver","D:\\workSpace\\FlipkartId\\data\\geckodriver.exe");
   // WebDriver driver = new FirefoxDriver();
		/*if(Browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","D:\\workSpace\\FlipkartId\\data\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	}else if(Browser.equalsIgnoreCase("chrome")) {*/
   System.setProperty("webdriver.chrome.driver","D:\\workSpace\\FlipkartId\\data\\chromedriver.exe");
    	driver = new ChromeDriver();
    	/*}*/
    	driver.get("https://www.medplusmart.com/");
	}
	
	
	 @AfterClass
	    public void closeBrowser() 
	    {
	    	driver.quit();
	    }

}
