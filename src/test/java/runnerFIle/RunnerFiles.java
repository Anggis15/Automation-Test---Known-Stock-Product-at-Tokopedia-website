package runnerFIle;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/featuresfile", 
		glue = "testcase",
		plugin = {
				"pretty",
				"html:target/cucumber-reports",
				"json:target/cucumber-reports/cucumber2022.json"
		})

public class RunnerFiles extends AbstractTestNGCucumberTests {

}
