package com.les.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/les/step_definitions"
        //,tags = "@regression"
        ,plugin = "html:target/reports.html",
        publish = true
        //,dryRun = true <- won't execute code, will run to see if any snippets are not implemented.

)


public class CukesRunner {
}
