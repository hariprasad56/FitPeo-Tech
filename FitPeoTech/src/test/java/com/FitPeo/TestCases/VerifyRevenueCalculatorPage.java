package com.FitPeo.TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.FitPeo.PageObjects.HomePageElements;
import com.FitPeo.PageObjects.RevenueCalculatorPageElements;

public class VerifyRevenueCalculatorPage extends BaseTest {
	SoftAssert sf;
	@Test()
	public void validateRevenueCalculator()
	{
		
		HomePageElements hpe=new HomePageElements(driver);
		hpe.getOptionIcon();
		hpe.revenueCalculator();
	    String actualTitle=driver.getTitle();
		String expTitle="Remote Patient Monitoring (RPM) - fitpeo.com";
		 sf=new SoftAssert();
	   if(actualTitle==expTitle)
		{
			
			sf.assertTrue(true);
			log.info("Revenue calculator is sucessfully opened");
			
		}
		sf.assertAll();
		RevenueCalculatorPageElements rcpe=new RevenueCalculatorPageElements(driver);
		rcpe.scrollPaticularE();
    	rcpe.getleftSlider();
		String desiredValue="560";
		rcpe.getSliderTextField(desiredValue);
		int valueAtpp=rcpe.getSliderAtPartPoint();
		String valueAtPPS=String.valueOf(valueAtpp);
		if(desiredValue==valueAtPPS)
		{
			sf.assertTrue(true);
			log.info("test is pass");
		}
		else
		{
			sf.assertTrue(false);
			log.info("test is fail");
			sf.assertAll();
		}
		sf.assertAll();
		String num="820";
		rcpe.getSliderTextField(num);
		rcpe.scrollFurther();
		rcpe.getCheckBox9091();
		rcpe.getcheckbox9453();
		rcpe.getcheckBox9454();
		rcpe.getcheckbox9474();
		String actualReimValue=rcpe.getTotalRecurringReimValue();
		String estiReimValue="$110700";
		if(actualReimValue==estiReimValue)
		{
			sf.assertTrue(true);
			log.info("test is pass");
			
		}
		else
		{
			sf.assertTrue(false);
			log.info("test is fail");
			
		}
		sf.assertAll();
		
		
		
	}

}
