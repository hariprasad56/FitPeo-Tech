package com.FitPeo.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FitPeo.TestCases.BaseTest;

public class RevenueCalculatorPageElements {
	public WebDriver driver;
	 BaseTest bt;
	public RevenueCalculatorPageElements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-sy3s50'])[1]")private WebElement left;
	@FindBy(xpath="//input[@id=':R57alklff9da:']")private WebElement sliderTextField;
	@FindBy(xpath="//div[@class='MuiBox-root css-rfiegf']//div[1]//label[1]//span[1]//input[1]")private WebElement checkbox9091;
	@FindBy(xpath="//div[@class='MuiBox-root css-1p19z09']//div[2]//label[1]//span[1]//input[1]")private WebElement checkbox9453;
	@FindBy(xpath="//div[3]//label[1]//span[1]//input[1]")private WebElement checkbox9454;
	@FindBy(xpath="//div[8]//label[1]//span[1]//input[1]")private WebElement checkbox9474;
	@FindBy(xpath="//div[@class='MuiBox-root css-m1khva']//p[2]")private WebElement totalRecurringReimValue;
	@FindBy(xpath="//span[@class='MuiSlider-track css-10opxo5']")private WebElement sliderAtPartPoint;
	
	public void getleftSlider()
	{
		bt=new BaseTest();
		bt.waits(left, 30);
		int xDValue=174;
		int xLoc=left.getLocation().getX();
		int yLoc=left.getLocation().getY();
		bt.actionsDD(driver, left, xDValue, yLoc);
		
		
	}
	
	public void getSliderTextField(String value)
	{
		bt.waits(sliderTextField, 20);
		sliderTextField.sendKeys(value);
		
	}

	public void getCheckBox9091()
	{
		bt.waits(checkbox9091, 20);
		checkbox9091.click();
	}

	public void getcheckbox9453()
	{
		bt.waits(checkbox9453, 20);
		checkbox9453.click();
	}

	public void getcheckBox9454()
	{
		bt.waits(checkbox9454, 20);
		checkbox9454.click();
	}

	public void getcheckbox9474()
	{
		bt.waits(checkbox9474, 20);
		checkbox9474.click();
		
	}

	public String  getTotalRecurringReimValue()
	{
		String reValue=totalRecurringReimValue.getText();
		return reValue;
	}
	public int getSliderAtPartPoint()
	{
		bt.waits(sliderAtPartPoint, 30);
		int xValueAtPP=sliderAtPartPoint.getLocation().getX();
		
		return xValueAtPP;
	}
	 public void scrollPaticularE()
	 {
		 try
		 {
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", left);
		 }
		 catch(Exception e)
		 {
			 System.out.println("move to next step");
		 }
	 }
	 public void scrollFurther()
	 {
		 try
		 {
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", checkbox9091);
		 }
		 catch(Exception e)
		 {
			 System.out.println("move to next step");
		 }
	 }

	
	
	

}
