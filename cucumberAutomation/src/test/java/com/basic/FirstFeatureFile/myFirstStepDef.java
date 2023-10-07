package com.basic.FirstFeatureFile;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class myFirstStepDef {
	
	
	//WebDriver instance:
	
	WebDriver driver = new FirefoxDriver();
	
	String expectedUserFirstName = "David";

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
		driver.quit();
	}
	
	
	
	
	

}
