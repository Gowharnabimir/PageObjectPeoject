package com.tetaak.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tektaak.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy( xpath="//a[normalize-space()='All categories']")
	WebElement categories;
	
	@FindBy(xpath="//a[normalize-space()='All Brands']")
	WebElement AllBrands;
	
	@FindBy(xpath="//a[normalize-space()='Coupons']")
	WebElement coupons;
	
public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void checkcategories() {
		
		categories.click();
		
		
	}
	public void checkbrands() {
		AllBrands.click();
	}
	public void checkcoupons() {
		coupons.click();
	}
}
