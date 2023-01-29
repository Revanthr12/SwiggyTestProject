package stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.excel.*;
public class locationstep {
	
	
	mainpage mainpagetest = new mainpage();
	WebDriver driver = new ChromeDriver();

@Given("I can be on the swiggy homepage website")
public void i_am_on_swiggy_homepage_website() {
	System.out.println("I can be on the swiggy homepage website");
	mainpagetest.home(driver);
}
@When("I can able to click on Enter your delivery location")
public void i_click_on_enter_your_delivery_location() {
	System.out.println("I can able to click on enter your delivery location");
	mainpagetest.home(driver);
	mainpagetest.loc(driver);
	
}
@Then("I can able to press enter to select location")
public void i_press_enter_to_select_location() {
	System.out.println("I can able to press enter to select location");
	mainpagetest.home(driver);
	mainpagetest.loc(driver);
}
}
