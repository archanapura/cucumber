package com.medplus.MedicineApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServiceLocality extends MainJava
{
	 WebDriver driver;
     
	  public ServiceLocality(WebDriver driver)
	   {
		   this.driver =driver;
		   PageFactory.initElements(driver, this);
	   }
	  
	  @FindBy(xpath="//input[@id='sltdCity']")
	  private WebElement selectCity;
	
	  @FindBy(xpath="//input[@id='sltdLocality']")
	  private WebElement pincode;
	  
	  @FindBy(xpath="(//a[contains(text(),'560')])[1]")
	  private WebElement selectLocality;
	  
	  @FindBy(xpath="//button[contains(text(),'Submit')]")
	  private WebElement submit;
	
public void Locality() 
{
	
	//WebDriverWait wait=new WebDriverWait(driver, 40);
	
//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='sltdCity']")));
	wait1();
	selectCity.sendKeys("Bangalore");
	wait1();
    selectCity.sendKeys(Keys.ENTER);
    wait1();
	pincode.sendKeys("560072");
	wait1();
	selectLocality.click();
	wait1();
	submit.click();
	
	}
}
