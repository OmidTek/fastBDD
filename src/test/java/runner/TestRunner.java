package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features=  "classpath=features",//or "./src/test/resources/features",
        glue={"hookpackage", "stepdefinition"},
        tags="@test",
        publish=false,
        plugin =  {"pretty",
        "html:target/site/cucumberReport.html",
        "json:target/cucumber.json"},
        dryRun = false
)
public class TestRunner {

}
