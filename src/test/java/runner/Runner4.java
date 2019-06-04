package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/case4.feature",glue="scenario",plugin="json:C://report/cucumber.json")
public class Runner4 {
}
