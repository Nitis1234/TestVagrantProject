package com.TestVagrantProject.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver ldriver;

	//2. Create constructor
	public LandingPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);//driver that will be used to lookup the web element

	}
	//Identify WebElement
	@FindBy(xpath="//td[normalize-space()='India']")
	WebElement Country;
	
	@FindBy(xpath="//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]")
	WebElement ReleseDate;
	
	//Creating Method For WebElemnt
	public String getCountryName() {
		return (Country.getText());
	}
	
	public String getReleseDate() {
		return(ReleseDate.getText());
	}

}
