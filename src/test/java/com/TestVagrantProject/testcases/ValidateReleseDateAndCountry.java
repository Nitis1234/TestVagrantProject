package com.TestVagrantProject.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TestVagrantProject.pageobject.LandingPage;
import com.TestVagrantProject.utilities.BaseClas;
@Listeners(com.TestVagrantProject.utilities.ExtentListinerClass.class)
public class ValidateReleseDateAndCountry extends BaseClas {
	@Test(priority=1)
	public void ValidateCountry() throws IOException {
		driver.get(url);
		Log.info("Web Page Is Open");
		//Creating Object For Page Class
		LandingPage lp=new LandingPage(driver);
		String Country=lp.getCountryName();
		System.out.println(Country);
		Log.info("Country Name iS Printed");
		//Validating Conditions
		if(Country.equalsIgnoreCase("India")) {
			Assert.assertTrue(true);
			Log.info("Country Name Matched");
		}else {
			CaptureScreenshot(driver,"ValidateCountryName");
			Log.info("Country Name Did nor Match");
			Assert.assertTrue(false);
		}
	}
	@Test(priority=2)
	public void ValidateReleseDate() throws IOException {
		//Url Opens
		driver.get(url);
		Log.info("Web Page Is Open");
		LandingPage lp=new LandingPage(driver);
		String ReleseDate=lp.getReleseDate();
		System.out.println(ReleseDate);
		Log.info("ReleseDate iS Printed");
		if(ReleseDate.equalsIgnoreCase("17 December 2021")) {
			Assert.assertTrue(true);
			Log.info("ReleseDate Matched");
		}else {
			//Screenshot Captchured
			CaptureScreenshot(driver,"ValidateCountryName");
			Log.warn("ReleseDate Did nor Match");
			Assert.assertTrue(false);
		}
	}
	

}
