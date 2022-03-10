package com.wescodist.automation.validateApi.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com/wescodist/automation/validateApi/steps"},
        monochrome = true,
        tags = "@FetchL1category",
        publish = false,
        dryRun = false
)
public class TestRunner {
}

