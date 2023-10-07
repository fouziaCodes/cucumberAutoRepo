package shareDataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SharedClass {
	
	
	WebDriver driver;
	
	@Before
	public WebDriver setup() {
		if(driver==null) {
		
		//setting up webDriver before each scenario
		System.setProperty("webdriver.gecko.driver", "/Users/fouziaahmed/web Drivers/geckodriver");
		driver = new FirefoxDriver();
		System.out.println("before1");
		}
		return driver;
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
		driver=null;
	}
	

}
