package com.medplus.MedicineApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Hello world!
 *
 */
public class App extends MainJava
{
   WebDriver driver;
      
  public App(WebDriver driver)
   {
	   this.driver =driver;
	   PageFactory.initElements(driver, this);
   }
  
  @FindBy(xpath="//input[@id='enterval']") 
  private WebElement searchText;
  
  @FindBy(xpath="//button[text()='SEARCH']")
  private WebElement searchButton;
  
  @FindBy(xpath="//button[text()='All Product']")
  private WebElement selectProduct;
  
  @FindBy(id="general")
  private WebElement GeneralStores;
  
  public void selectProduct()
  {
	  wait1();
	  selectProduct.click();
	  wait1();
	  GeneralStores.click();
	  wait1();
	 // selectProduct.click();
  }
  public void searchMedicine() 
  {
	  wait1();
	  searchText.sendKeys("Crocin");
	  wait1();
	//  searchButton.click();
  }
  
  
}
