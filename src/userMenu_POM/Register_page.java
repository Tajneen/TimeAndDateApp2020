package userMenu_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register_page {
	WebDriver driver;
	//need to use constructor here.
	public Register_page(WebDriver driver){
		this.driver= driver;
	}
			By accountID=By.linkText("My account");
			//Actions mousehover = new Actions(driver);
		
			By register=By.xpath("//a[@id='popreg']");
			
			By name=By.xpath("//input[@name='fullname']");
			
			By email=By.xpath("//input[@name='email']");
			By password=By.xpath("//input[@id='password']");
			By finalpassword=By.xpath("//input[@id='password1']");
			By createR=By.xpath("//input[@id='create']");
			
			public WebElement accountMethod(){
				//create method for My Account.
				return driver.findElement(accountID);
			}
			public WebElement registerMethod(){
				//create method for EmailID.
				return driver.findElement(register);
			}
			public WebElement nameMethod(){
				//create method for EmailID.
				return driver.findElement(name);
			}
			
			
			public WebElement emailMethod(){
				//create method for EmailID.
				return driver.findElement(email);
			}
			public WebElement passwordMethodone(){
				//create method for passwordID.
				return driver.findElement(password);
			}
			public WebElement passwordMethodtwo(){
				//create method for passwordID.
				return driver.findElement(finalpassword);
			}
			public WebElement createMethod(){
				//create method for signInClick.
				return driver.findElement(createR);
			}


			

}
