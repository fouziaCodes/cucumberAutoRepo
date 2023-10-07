package hooksSD;

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

public class hooksSD {

WebDriver driver=null; //initializing to be used in all methods
	
@Before
public void beforeSetup1() {
	//setting up webDriver before each scenario
	System.setProperty("webdriver.gecko.driver", "/Users/fouziaahmed/web Drivers/geckodriver");
	driver = new FirefoxDriver();
	System.out.println("before1");

	
}
//@Before(order=2)
//public void beforeSetup2() {
//	//setting up webDriver before each scenario
//	System.setProperty("webdriver.gecko.driver", "/Users/fouziaahmed/web Drivers/geckodriver");
//	driver = new FirefoxDriver();
//	System.out.println("before2");
//
//}

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

@And("user {string} enters last name")
public void user_enters_last_name(String lastName) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "/Users/fouziaahmed/web Drivers/geckodriver");
	//driver.get("https://www.facebook.com/");
	driver.findElement(By.name("lastname")).sendKeys(lastName);
	Thread.sleep(2000);
}
	
@And("user checks if user {string} last name is present")
public void user_checks_if_user_last_name_is_present(String lastName) throws InterruptedException {
	String actualUserLastName = driver.findElement(By.name("lastname")).getAttribute("value");
	assertEquals(lastName,actualUserLastName);
	System.out.println("Actual last name is "+actualUserLastName);
	Thread.sleep(1000);
}
@And("user verifies that mobile number field is blank")
public void user_verifies_that_mobile_number_field_is_blank() throws InterruptedException {
	
	String actualMobNum = driver.findElement(By.xpath("//input[@name='reg_email__']")).getAttribute("value");
	Thread.sleep(1000);
	assertEquals("", actualMobNum);
	System.out.println("mob number field is empty");
	
}

//@Then("close browser")
//public void close_browser() {
//	driver.quit();
//}

@After
public void tearDown1() {
	//will quit all browsers and re-initialize driver= null 
	driver.quit();
	driver=null;
	System.out.println("after2");
}
//@After(order=1)
//public void tearDown2() {
//	//will quit all browsers and re-initialize driver= null 
//	driver.quit();
//	//driver=null;
//	System.out.println("after1");
//
//}

}
