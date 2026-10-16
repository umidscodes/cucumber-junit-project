package com.les.step_definitions;

import com.les.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
we will be able to create pre- and post-condition for all the scenario s and even steps
we can also add tags to target specific tests
@Before ("@admin")
 */
public class Hooks {

    @Before
    public void setupMethod() {
        //import the one coming from io.cucumber.java
        System.out.println("Before --> RUNNING BEFORE EACH SCENARIO");

    }
    @After
    public void teardownMethod(Scenario scenario) {
        System.out.println("After --> RUNNING AFTER EACH SCENARIO");

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
            Driver.closeDriver();
        }
    }


}
