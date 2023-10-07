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

public class ShareDataSD2 {

	WebDriver driver;
	
	public ShareDataSD2(SharedClass share) {
		
		driver = share.setup();
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



}
