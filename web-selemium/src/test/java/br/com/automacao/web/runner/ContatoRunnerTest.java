package br.com.automacao.web.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@exemplo"},
		features = {"src/test/resources/features"},
		plugin = {"pretty"},
		glue = {""},
		monochrome = true,
		strict = true,
		dryRun = false)

public class ContatoRunnerTest {

}
