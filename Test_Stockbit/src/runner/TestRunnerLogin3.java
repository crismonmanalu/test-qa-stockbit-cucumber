package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "Features", tags= {"@login3"}, glue = "stepDefinitionLogin3")
public class TestRunnerLogin3 {

}
