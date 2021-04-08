import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@exemplo"},
		features = {"src/test/java/Cliente.feature"},
		plugin = {"pretty"},
		glue = {""},
		monochrome = true,
		strict = true,
		dryRun = false)



public class ClienteTest {

}
