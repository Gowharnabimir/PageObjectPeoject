package com.tetaak.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tektaak.base.BaseClass;

public class MyPanelPage extends BaseClass {
	
	@FindBy(xpath="//a[normalize-space()='My Panel']")
	WebElement MyPanel;

	
    public  MyPanelPage () {
		
		PageFactory.initElements(driver, this);
	}
    public void checkMyPanel() {
		
    	MyPanel.click();
			
	}
    
    
}
