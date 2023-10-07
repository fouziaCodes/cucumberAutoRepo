package tagsSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/com/basic/tagsFF" }
				, glue = { // "com.basic.FirstFeatureFile",
							"tagsSD" 
						}
				// ,tags= "@Smoke"
				, plugin = { "pretty", "html:target/cucumber-htmlreport"// creates cucumber-htmlreport folder under target
																	// folder containing html report
				,"json:target/cucumber-report10.json" // 
				//,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" 
				}
				, monochrome = false
				, dryRun = false
				)
public class RunnerClasstagsSDTest {
	 
	
}
