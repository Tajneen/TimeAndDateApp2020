package myExecution;

import homePage_POM.FaceBook_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import userMenu_POM.Register_page;

public class RegisterClassExecution{
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
	public void myFaceBookTest() throws InterruptedException{
		FaceBook_page myFBObj=new FaceBook_page(driver);
		myFBObj.emailMethod().sendKeys("8326337109");
		myFBObj.passwordMethod().sendKeys("Rasin1234&!");
		myFBObj.submitMethod().click();
	


}
}
