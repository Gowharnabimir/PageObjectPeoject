package com.teektaak.testcases;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.tektaak.base.BaseClass;
import com.tetaak.pages.HomePage;


public class HomePageTest extends BaseClass{
	HomePage homePage;
	@Test(priority = 3)
	public void checkallcateroriesTest() throws InterruptedException {
		
		//test=extent.createTest("HomePageTest");
		
		homePage=loginPage.login("gauhermir@gmail.com","123456");
		homePage.checkcategories();
		Thread.sleep(2000);
		String expectedURL="https://tektaak.ae/v2/categories";
		Thread.sleep(2000);
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	} 
	@Test(priority = 4)
	
	
	
	public void BrandsTest() throws InterruptedException {
		
		//test=extent.createTest("HomePageTest");
		
		homePage=loginPage.login("gauhermir@gmail.com","123456");
		homePage.checkbrands();
		Thread.sleep(2000);
		String expectedURL="https://tektaak.ae/v2/brands";
		Thread.sleep(2000);
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	
    @Test(priority = 5)
	
	public void CouponsTest() throws InterruptedException {
    	
    	//test=extent.createTest("HomePageTest");
    	
		homePage=loginPage.login("gauhermir@gmail.com","123456");
		homePage.checkcoupons();
		Thread.sleep(2000);
		String expectedURL="https://tektaak.ae/v2/brands";
		Thread.sleep(2000);
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
    	
    }  
}
