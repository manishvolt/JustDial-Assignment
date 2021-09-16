package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:Feature",
		glue="StepDefs",
		tags="",
		dryRun=false,
		monochrome=true,
		publish=true,
		plugin={"pretty","html:target/html/report/report.html", "json:target/json/file.json"}
		)



public class TestRunner {

}
