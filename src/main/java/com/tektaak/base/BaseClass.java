package com.tektaak.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.extentManager.ExtentManager;
import com.tetaak.pages.LoginPage;



public class BaseClass {
	
	public static WebDriver driver;
	public LoginPage loginPage;
	
	
	
	@BeforeSuite
	public void beforeSuite() {
		
		DOMConfigurator.configure("log4j.xml");
	}
	
	@BeforeSuite
	public void BeforeSuit() {
		
		ExtentManager.setExtent();
	}
	
	@AfterSuite
	public void aftersuit() {
		
		ExtentManager.endReport();
	}
	
	 
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","C:\\browserdriver\\chromedriver.exe");
			   
			   
			  WebDriver driver= new ChromeDriver(); 
			   driver.manage().window().maximize();
			   driver.get("https://tektaak.ae/v2/users/login");
			   Thread.sleep(4000);
			   loginPage=new LoginPage();
	
	
	/*@Parameters("browser")
	
    @BeforeMethod
	public  void setup(String browser) throws InterruptedException {
    	if (browser.equalsIgnoreCase("Chrome")) {
		 System.setProperty("webdiver.chrome.driver","C:\\browserdriver\\chromedriver.exe");
			   
			   
			   driver= new ChromeDriver(); 
			  
			   
			  
			 //  loginPage=new LoginPage();
    	}
    	else if (browser.equalsIgnoreCase("Firefox")) {
    		 System.setProperty("webdriver.gecko.driver","C:\\browserdriver\\geckodriver.exe");
    		 driver = new FirefoxDriver();

    	}
    	 driver.manage().window().maximize();
    	 driver.get("https://tektaak.ae/v2/users/login");
    	 Thread.sleep(4000);
    	 loginPage=new LoginPage();*/
	}
	@AfterMethod
	public static void tearDown() throws IOException {
		
		driver.close();
		
	}

	public static String screenShot(WebDriver driver,String filename) {
		  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		  TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		  File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		  String destination = System.getProperty("user.dir")+"\\ScreenShot\\"+filename+"_"+dateName+".png";
		  File finalDestination= new File(destination);
		  try {
		   FileUtils.copyFile(source, finalDestination);
		  } catch (Exception e) {
		   // TODO Auto-generated catch block
		   e.getMessage();
		  }
		  return destination;
		 }
		 
		 public static String getCurrentTime() {  
		     String currentDate = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());  
		     return currentDate;  
		 }  
}
