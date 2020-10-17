package timeAndDateAppTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import userMenu_POM.Register_page;

public class TestExecutionThree {
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
		public void myRegisterTest()throws InterruptedException{
		Register_page myregisterObj=new Register_page(driver);
		myregisterObj.accountMethod().click();
		Thread.sleep(1000);
		myregisterObj.registerMethod().click();
		Thread.sleep(1000);
		myregisterObj.nameMethod().sendKeys("Nazmul");
		 Thread.sleep(1000);
		 myregisterObj.emailMethod().sendKeys("Samiul_Shiblee@yahoo.com");
		 Thread.sleep(1000);
		 myregisterObj.passwordMethodone().sendKeys("Nihan1234");
		 Thread.sleep(1000);
		 myregisterObj.passwordMethodtwo().sendKeys("Nihan1234");
		 Thread.sleep(1000);
		 myregisterObj.createMethod().click();

	}
}
