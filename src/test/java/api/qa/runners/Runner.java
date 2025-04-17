package api.qa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "api/qa/step_definitions",
        dryRun = false,
        tags = "@regression",
        plugin = {"pretty", "html:target/apiReport.html", "rerun:target/apiFailedTests.txt"}
)
public class Runner {
}
