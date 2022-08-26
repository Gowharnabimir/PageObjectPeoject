package com.teektaak.testcases;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.tektaak.base.BaseClass;
import com.tetaak.pages.HomePage;
import com.utility.Log;



public class LoginPageTest extends BaseClass{
	//LoginPage loginpage;
	HomePage homePage;
	
	@Test(priority = 1)
	public void LogoTest() throws InterruptedException {
		//test=extent.createTest("loginPageTest");
		boolean flag=loginPage.validateLogo();
		Thread.sleep(2000);
		Assert.assertTrue(flag);
		
		
	}
	
	@Test(priority = 2)
	public void loginTest() throws InterruptedException {
		
		Log.startTestCase("loginTest");
		//test=extent.createTest("loginPageTest");
		Log.info("User enters user name and password");
		homePage=loginPage.login("gauhermir@gmail.com","12345");
		Thread.sleep(5000);
		String expectedURL="https://tektaak.ae/v2/";		
		String actualURL=driver.getCurrentUrl();
		Log.info("Verify if user is able to login");
		Assert.assertEquals(actualURL, expectedURL);
		Log.info("Login is Sucess");

		
		
	}

}
