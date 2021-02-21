package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;
import PageObjects.SigninObjects;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class Step extends TestBase{

SigninObjects obj;	

@Before
public void LaunchBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\New folder\\E-commerce\\chromedriver.exe");
	driver=new ChromeDriver();                    
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	obj=new SigninObjects(driver);
}

@Given("user launches application")
public void user_launches_application() {
    driver.get(url);
}

@Given("user sign in with {string} and {string}")
public void user_sign_in_with_and(String email, String password) {
    obj.OpenSignInForm();
    obj.Email(email);
    obj.clickcontinue();
    obj.Password(password);
    obj.clicksignin();
}

@Given("user opens hamberger menu and search product")
public void user_opens_hamberger_menu_and_search_product() {
    System.out.println("hi");
}



@Given("user selects the product from results page")
public void user_selects_the_product_from_results_page() {
	System.out.print("hi");
}

@When("user clicks on buynow")
public void user_clicks_on_buynow() {
	System.out.print("hi");
}

@Given("launch site")
public void launch_site() {
   driver.get(url2);
}


@Given("Fetch price of nestle india")
public void fetch_price_of_nestle_india() {
    
	WebDriverWait wait=new WebDriverWait(driver, 20);
    WebElement a=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Nestle India')]/../following-sibling::td[3]")));
	System.out.println(a.getText());
    
}	


@After(order=2)
public void ScreenShot(Scenario scn){
	TakesScreenshot a=getScreenshot
	
}

@After(order=1)
public void CleanUp(){
	driver.quit();
}
}
