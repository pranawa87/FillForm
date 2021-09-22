package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"../FeatureFillForm.feature"},plugin = {"json:target/cucumber.json"},
glue={"StepDef"},  monochrome = false)

public class runner {

}
