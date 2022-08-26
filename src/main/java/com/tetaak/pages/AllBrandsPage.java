package com.tetaak.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tektaak.base.BaseClass;

public class AllBrandsPage extends BaseClass {
	
	@FindBy(xpath="//img[@alt='Feryano']")

	WebElement Feryano;
	
	@FindBy(xpath="//a[normalize-space()='Feryano key chain G']")

	WebElement Feryanokeychain;
	
	
   public AllBrandsPage () {
		
		PageFactory.initElements(driver, this);
	}
   
   public void clickFeryanoBrand() {
	   Feryano.click();
		   	   
   }
   
   public void clickonFirstProduct() {
	   Feryanokeychain.click();
	
   }
}
