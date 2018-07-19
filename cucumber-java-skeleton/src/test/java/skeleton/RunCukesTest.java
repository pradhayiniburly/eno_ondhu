package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber-reports","json:src/cucumber-reports/reports1.json"},
tags= {"@Regression"}, monochrome=true)
public class RunCukesTest {
}
