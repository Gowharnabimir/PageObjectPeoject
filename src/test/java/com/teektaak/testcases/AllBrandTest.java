package com.teektaak.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tektaak.base.BaseClass;
import com.tetaak.pages.AllBrandsPage;
import com.tetaak.pages.HomePage;
import com.tetaak.pages.LoginPage;

public class AllBrandTest extends BaseClass{
	   
	static HomePage homePage;
	static AllBrandsPage allbrandsPage;
	LoginPage loginpage;
	
	
	@Test
	public  void clickFeryanoTest() throws InterruptedException {
		allbrandsPage= new AllBrandsPage();
		homePage=loginPage.login("gauhermir@gmail.com","123456");
		homePage.checkbrands();
		Thread.sleep(3000);
	    allbrandsPage.clickFeryanoBrand();
		Thread.sleep(2000);
		String expectedURL="https://tektaak.ae/v2/brand/feryano-ykqah";
		Thread.sleep(2000);
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	@Test
	public void clickOnFirstProductTest() throws InterruptedException {
		allbrandsPage= new AllBrandsPage();
		homePage=loginPage.login("gauhermir@gmail.com","123456");
		homePage.checkbrands();
		Thread.sleep(3000);
	    allbrandsPage.clickFeryanoBrand();
		Thread.sleep(2000);
		allbrandsPage.clickonFirstProduct();
		
	}

}
