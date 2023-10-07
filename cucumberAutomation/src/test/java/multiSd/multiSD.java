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

public class multiSD {

WebDriver driver = null;

@Before
public void beforeScenario() {
	System.setProperty("webdriver.gecko.driver", "/Users/fouziaahmed/web Drivers/geckodriver");

	 driver = new FirefoxDriver();
	 System.out.println("in before scenario step");
}

@Given("user is on Gogle page")
public void user_is_on_Gogle_page() {
	driver.get("https://www.google.com/");
	System.out.println("user is on Google page");
}

@When("user enters search {string}")
public void user_enters_search(String query) {
	driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(query);
	System.out.println(driver.findElement(By.xpath("//textarea[@title='Search']")).getAttribute("value"));
	

}
@After
public void tearDown() {
	driver.quit();
	driver=null;
}
}
