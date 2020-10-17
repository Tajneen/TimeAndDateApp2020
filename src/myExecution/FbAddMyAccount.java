package myExecution;

import homePage_POM.AddFBAccount;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FbAddMyAccount {
	WebDriver driver;
	@BeforeTest
	public void Beforetest() throws InterruptedException{
	String chromeDriverPath = 
			"C:\\SeleniumWebDriverProject\\DriverExtention\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);	
		
	}
	@Test
	public void myaccounttest() throws InterruptedException{
		AddFBAccount fbmyObj=new AddFBAccount(driver);
		fbmyObj.myfnameMethod().sendKeys("Enan");
		fbmyObj.mylnameMethod().sendKeys("Huda");
		fbmyObj.emailMethod().sendKeys("6466453746");
		fbmyObj.passwordMethod().sendKeys("Nihan123@");
		WebElement mydropdownmm =fbmyObj.monthMethod();
		Select dropdownmm = new Select(mydropdownmm);
		dropdownmm.selectByVisibleText("Jun");
		Thread.sleep(1000);
		//Select desire day from drop down.
		WebElement mydropdowndd =fbmyObj.dayMethod();
		Select dropdowndd = new Select(mydropdowndd);
		dropdowndd.selectByVisibleText("3");
		Thread.sleep(1000);
		//Select desire year from drop down.
		WebElement mydropdownyy =fbmyObj.yearMethod();
		Select dropdownyy = new Select(mydropdownyy);
		dropdownyy.selectByVisibleText("1988");
		Thread.sleep(1000);
		fbmyObj.genderMethod().click();
		//fbmyObj.fbcheckMethod().click();
		fbmyObj.fbsubmitMethod().click();
		
		
	}
		}
	


