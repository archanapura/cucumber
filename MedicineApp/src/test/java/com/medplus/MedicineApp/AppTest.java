package com.medplus.MedicineApp;

import org.testng.annotations.Test;

public class AppTest extends MainTest
   {
	
    @Test
    public void HomePage() 
    {
    	ServiceLocality slocality =new ServiceLocality(driver);
    	slocality.Locality();
    	App app = new App(driver);
    	app.selectProduct();
    //	app.searchMedicine();
    	
    	
    	
    }
   
}
