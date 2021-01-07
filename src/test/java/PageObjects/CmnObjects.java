package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CmnObjects {

	WebDriver driver;
	
	public CmnObjects(WebDriver driver){
	this.driver=driver;
	}
	
   private By SignUp=By.id("h_sin_up");
   private By UserName=By.id("lgn_name");
   private By MobileNumber=By.xpath("//input[@id='lgn_mob']");
   private By Submit=By.xpath("//button[@class='pull-right btn btn-primary modal-button-small wrapper ']");
   
   
   public void Signup(){
	  driver.findElement(SignUp);
   }
   
   public void UserName(){
	   //driver.findElement(UserName).click();
	   WebElement EnterUserName=driver.findElement(UserName);
	   EnterUserName.sendKeys("Manish");
   }
   
   public void PhoneNumber(){
	   driver.findElement(MobileNumber).click();
	   WebElement EnterMobileNumber= driver.findElement(MobileNumber);
	   EnterMobileNumber.sendKeys("7507190724");
	   
   }
   
	public void SubMit(){
		driver.findElement(Submit).click();	
	   
   }
	
}

    