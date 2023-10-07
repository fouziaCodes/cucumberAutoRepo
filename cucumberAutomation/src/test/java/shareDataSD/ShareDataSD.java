package shareDataSD;

import static org.junit.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShareDataSD extends SharedClass{

WebDriver driver; //initializing to be used in all methods

public ShareDataSD(SharedClass share) {
	
	driver = share.setup();
	}
	

@Given("user is on facebook home page and clicks on Create Account")
public void user_is_on_facebook_home_page_and_clicks_on_Create_Account() throws InterruptedException {
	

	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	
	Thread.sleep(1000);
	
}

@When("user {string} enters first name")
public void user_enters_first_name(String userName) {
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(userName);
	
	
}

@Then("user checks if user {string} first name is present")
public void user_checks_if_user_first_name_is_present(String firstName) {
	
	String userFirstNameActual = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
	System.out.println(userFirstNameActual);
	assertEquals(firstName, userFirstNameActual);
	System.out.println("First Name is correct.");
	
}




}
