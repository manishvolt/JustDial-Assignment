package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SigninObjects {

WebDriver driver;	
	
private By SignInFocus=By.xpath("//a[@id='nav-link-accountList']");
private By SignInButton=By.xpath("//span[@class='nav-action-inner']");
private By EmailTextBox=By.id("ap_email");
private By ClickContinue=By.id("continue");
private By PasswordBox=By.id("ap_password");
private By SignIn=By.id("signInSubmit");


public SigninObjects(WebDriver driver){
	this.driver=driver;
}

public void OpenSignInForm(){
	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement goinsigninwindow=wait.until(ExpectedConditions.visibilityOfElementLocated(SignInFocus));
	
	//WebElement GoInsideSignin=driver.findElement(SignInFocus);
	WebElement clicksignin=driver.findElement(SignInButton);
	Actions A=new Actions(driver);
	A.moveToElement(goinsigninwindow).click(clicksignin).build().perform();
}


public void Email(String text){
	WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement email= wait.until(ExpectedConditions.elementToBeClickable(EmailTextBox));
	email.clear();
	email.sendKeys(text);
}

public void Password(String text){
	WebElement password=driver.findElement(PasswordBox);
	password.sendKeys(text);
}

public void clickcontinue(){
	driver.findElement(ClickContinue).click();
}

public void clicksignin(){
	driver.findElement(SignIn).click();
}

}
