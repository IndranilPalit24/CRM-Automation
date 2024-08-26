package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/com/features/homePage.feature",
    glue = {"stepdefinition", "AppHooks"},
    plugin = {"pretty", "html:target/cucumber-reports"},
    monochrome = true
)

public class HomePageRunner {

}
