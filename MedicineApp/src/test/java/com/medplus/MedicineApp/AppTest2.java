package com.medplus.MedicineApp;

import org.testng.annotations.Test;

public class AppTest2 extends MainTest
{
	  @Test
	    public void HomePage2() 
	    {
	    	ServiceLocality slocality2 =new ServiceLocality(driver);
	    	slocality2.Locality();
	    	App app2 = new App(driver);
	    	app2.searchMedicine();
	    	
	    	
	    	
	    }

}
