package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


@CucumberOptions(features = {"src/test/Feature/FillForm.feature"}, glue = {"StepDef"},
        plugin = {"pretty",
                "html:target/site/cucumber-pretty",
                "json:target/site/cucumber.json"})

public class Test extends AbstractTestNGCucumberTests {

}
