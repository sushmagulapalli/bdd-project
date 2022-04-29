package org.learning.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./features/Login.feature",
        glue = "org.learning.stepDefinitions",
        dryRun = false,
        monochrome = true,
        plugin = {
                "pretty",
                "html:test-output"
        }
)
public class TestRunner {
}
