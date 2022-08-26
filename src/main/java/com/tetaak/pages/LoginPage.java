package com.tetaak.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tektaak.base.BaseClass;

public class LoginPage extends BaseClass {

	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="/html/body/div[1]/section[1]/div/div/div/div/div/div[2]/div[1]/form/div[4]/button")
	WebElement loginbtn;
	
	@FindBy(xpath="//img[@class='mw-100 h-30px h-md-40px']")
	WebElement logo;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	public boolean validateLogo() {
		logo.isDisplayed();
		return true;
		
	}
	
	public HomePage login(String uname, String pswd ) {
		
		Email.sendKeys(uname);
		Password.sendKeys(pswd);
		loginbtn.click();
		return new HomePage();
	}
}
