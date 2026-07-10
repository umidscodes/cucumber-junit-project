package com.les.step_definitions;

import com.les.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google_step_definitions {

    @When("user is on the google search page")
    public void user_is_on_the_google_search_page() {

        Driver.getDriver().get("http://google.com");

    }
    @Then("user should see titile is google")
    public void user_should_see_titile_is_google() {

    }
}
