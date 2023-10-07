package multipleScenarios;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multipleScenariosStepDef {

WebDriver driver = new FirefoxDriver();
	
String expectedUserFirstName = "David";
String expectedUserLastName = "Brown";

@Given("^user is on facebook home page and clicks on Create Account$")
public void user_is_on_facebook_home_page_and_clicks_on_Create_Account() {
	

	System.setProperty("webdriver.gecko.driver", "/Users/fouziaahmed/web Drivers/geckodriver");
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	
	
	
}

@When("^user enters first name$")
public void user_enters_first_name() {
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(expectedUserFirstName);
	
	
}

@Then("^user checks if user first name is present$")
public void user_checks_if_user_first_name_is_present() {
	
	String userFirstNameActual = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
	System.out.println(userFirstNameActual);
	assertEquals(expectedUserFirstName, userFirstNameActual);
	System.out.println("First Name is correct.");
	//driver.quit();
}

@And("^user enters last name$")
public void user_enters_last_name() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "/Users/fouziaahmed/web Drivers/geckodriver");
	//driver.get("https://www.facebook.com/");
	driver.findElement(By.name("lastname")).sendKeys(expectedUserLastName);
	Thread.sleep(2000);
}
	
@And("^user checks if user last name is present$")
public void user_checks_if_user_last_name_is_present() throws InterruptedException {
	String actualUserLastName = driver.findElement(By.name("lastname")).getAttribute("value");
	assertEquals(expectedUserLastName,actualUserLastName);
	System.out.println("Actual last name is "+actualUserLastName);
	Thread.sleep(1000);
}
@And("^user verifies that mobile number field is blank$")
public void user_verifies_that_mobile_number_field_is_blank() throws InterruptedException {
	
	String actualMobNum = driver.findElement(By.xpath("//input[@name='reg_email__']")).getAttribute("value");
	Thread.sleep(1000);
	assertEquals("", actualMobNum);
	System.out.println("mob number field is empty");
	
}

@Then("^close browser$")
public void close_browser() {
	driver.quit();
}

}
