package com.medplus.MedicineApp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MainJava 
{
	WebDriver driver;
	public void wait1() 
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void pressEnter() 
	{
		Actions act =new Actions(driver);
		act.sendKeys(Keys.ENTER);
	}

}
