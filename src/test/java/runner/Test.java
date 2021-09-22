package runner;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(features = "src/test/java/Feature File//FillForm.feature",
        glue = {"StepDef"},

        plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class Test extends AbstractTestNGCucumberTests {
//    features = "src/main/java/Features
}
