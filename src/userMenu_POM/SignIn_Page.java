package userMenu_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn_Page {
	WebDriver driver;
	//need to use constructor here.
	public SignIn_Page(WebDriver driver){
		this.driver= driver;
	}
		// driver.findElement(By.linkText("My account")).click();
		By accountID=By.linkText("My account"); 
		// driver.findElement(By.xpath("//input[@name = 'email']"))
		By emailID=By.xpath("//input[@name = 'email']");
		// driver.findElement(By.xpath("//input[@ name = 'password']"))
		By passwordID=By.xpath("//input[@ name = 'password']");
		//driver.findElement(By.xpath("//input[@ value= 'Sign In']"))
		By signInClick=By.xpath("//input[@ value= 'Sign In']");
	
	public WebElement accountMethod(){
		//create method for My Account.
		return driver.findElement(accountID);
	}
	public WebElement emailAddressMethod(){
		//create method for EmailID.
		return driver.findElement(emailID);
	}
	public WebElement passwordMethod(){
		//create method for passwordID.
		return driver.findElement(passwordID);
	}
	public WebElement submitMethod(){
		//create method for signInClick.
		return driver.findElement(signInClick);
	}


}
