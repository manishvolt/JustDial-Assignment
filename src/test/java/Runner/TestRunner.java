package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features="classpath:Feature",
		glue="StepDefs",
		tags="",
		plugin={"pretty","html:target/html/","json:target/json/file.json"},
		dryRun=false
)

public class TestRunner {
}
