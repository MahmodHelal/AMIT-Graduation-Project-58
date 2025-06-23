package TestRunner;
//This class is provided by Cucumber to integrate with TestNG. By extending it, your test runner can run Cucumber tests in TestNG.
import io.cucumber.testng.AbstractTestNGCucumberTests;
//This annotation allows you to configure the behavior of your Cucumber tests
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/main/resources/Features",  // Path to your feature files
        glue = "StepDefinitions",  // Path to step definition classes
        plugin = {
                "pretty",  // Pretty console output
                "html:target/Reports/cucumber-testng-report.html",  // HTML report
                "json:target/cucumber-testng.json"  // JSON report

        },
        monochrome = true,  // Makes the console output easier to read
        tags = "@regression"  // Run tests with @regression tag
)
public class Runner  extends AbstractTestNGCucumberTests {

}





