package StepDefs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.CmnObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
    
	String url="https://www.justdial.com/";
	WebDriver driver;
	CmnObjects commonobjects;
	
	@Given("user launches the url")
	public void user_launches_the_url() {
	    //System.setProperty("Webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
	    
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get(url);
	    
	}

	@Given("user clicks on signup button")
	public void user_clicks_on_signup_button(){
		commonobjects=new CmnObjects(driver);
		 commonobjects.Signup();
		// Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user enters the username")
	public void user_enters_the_username() {
	    commonobjects.UserName();
		// Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user enters mobile number and clicks on send OTP")
	public void user_enters_mobile_number_and_clicks_on_send_OTP() {
	    commonobjects.PhoneNumber();
	    commonobjects.SubMit();
		// Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("otp is sent")
	public void otp_is_sent() {
	    System.out.println("message sent");
		// Write code here that turns the phrase above into concrete actions
	    
	}


}
