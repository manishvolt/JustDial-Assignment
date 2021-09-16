package StepDefs;


import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step {

WebDriver driver;
TextContext t;


public Step(TextContext t1){     // all the objects present in TextContext are passed in the constructor here
	this.t=t1;
	this.driver=t.driver;  // driver of textcontext and driver of this class becomes common
}


@Given("user launches application")
public void user_launches_application() {
    driver.get("http://www.amazon.in");
}


//And user sign in with "nighutmanish@gmail.com" and "ilovecs1.6"

@Given("user sign in with {string} and {string}")
public void user_sign_in_with_and(String email, String password) {
    t.obj.OpenSignInForm();
    t.obj.Email(email);
    t.obj.clickcontinue();
    t.obj.Password(password);
    t.obj.clicksignin();
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





}
