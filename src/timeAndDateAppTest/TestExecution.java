package timeAndDateAppTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import userMenu_POM.SignIn_Page;

public class TestExecution {
	WebDriver driver;
	@BeforeTest
	public void Beforetest() throws InterruptedException{
	String chromeDriverPath = 
			"C:\\SeleniumWebDriverProject\\DriverExtention\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/");
		Thread.sleep(3000);
}
	@Test
	public void MySignIntest() throws InterruptedException{
		SignIn_Page mySignInObj=new SignIn_Page(driver);
		//call the method from SignIn_page.
		mySignInObj.accountMethod().click();
		Thread.sleep(1000);
		mySignInObj.emailAddressMethod().sendKeys("mysmartqa1@gmail.com");
		Thread.sleep(1000);
		mySignInObj.passwordMethod().sendKeys("mysmart20");
		Thread.sleep(1000);
		mySignInObj.submitMethod().click();
		
		
	}

	
	@AfterTest
	public void closeApp(){
		driver.close();
	}

}
