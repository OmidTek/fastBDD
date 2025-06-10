package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
       // or features="./src/test/resources/features",
        features= "classpath:features",
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
