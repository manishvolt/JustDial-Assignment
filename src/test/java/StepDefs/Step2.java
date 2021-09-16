package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;

public class Step2 {

	WebDriver driver;
	TextContext t;
	
	public Step2(TextContext t1){
		this.t=t1;
		this.driver=t.driver;
	}
	
	
	
	@Given("launch site")
	public void launch_site() {
	   driver.get("http://demo.guru99.com/test/web-table-element.php");
	}


	@Given("Fetch price of nestle india")
	public void fetch_price_of_nestle_india() {
	    
		WebDriverWait wait=new WebDriverWait(driver, 20);
	    WebElement a=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Nestle India')]/../following-sibling::td[3]")));
		System.out.println(a.getText());
	    
	}		
	
	
}
