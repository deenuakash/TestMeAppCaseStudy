package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/case1.feature", glue="scenario",plugin="json:target/cucumber.json")
public class Runner1 {

}
