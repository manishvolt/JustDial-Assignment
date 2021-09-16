package StepDefs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.SigninObjects;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TextContext {

	
	WebDriver driver;
	SigninObjects obj;
	
	
	@Before
	public void LaunchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\New folder\\E-commerce\\chromedriver.exe");
		this.driver=new ChromeDriver();          // new driver creates after everymethod          
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		obj=new SigninObjects(this.driver);  // the same new driver is passed everytime here
	}
	
	@After(order=2)
	public void ScreenShot(Scenario scn){
		if(scn.isFailed()){
			TakesScreenshot s=(TakesScreenshot)driver;
			byte[] data=s.getScreenshotAs(OutputType.BYTES);
			scn.attach(data, "image/png", "failed step " + scn.getName());
		}
		
		else{
			scn.log("test case passed");
		}
	}

	@After(order=1)
	public void CleanUp(){
		driver.quit();
	}
	
	
	
}
