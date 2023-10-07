package multiSd;

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

public class demoSD {

WebDriver driver = null;

@Before
public void beforeScenario() {
	System.setProperty("webdriver.gecko.driver", "/Users/fouziaahmed/web Drivers/geckodriver");

	 driver = new FirefoxDriver();
	 System.out.println("in before scenario step");
}

@Given("user is on demo site page")
public void user_is_on_demo_site_page() {
	driver.get("https://demo.automationtesting.in/Register.html");
	System.out.println("user is on demo pafe page");
}

@When("user enters {string} first name")
public void user_enters_first_name(String firstName) {
	driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(firstName);
	//System.out.println(driver.findElement(By.xpath("//textarea[@title='Search']")).getAttribute("value"));
	

}

@And("user enters {string} last name")
public void user_enters_last_name(String lastName) {
	driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(lastName);
	//System.out.println(driver.findElement(By.xpath("//textarea[@title='Search']")).getAttribute("value"));
	

}
@After
public void tearDown() {
	driver.quit();
	driver=null;
}
}
