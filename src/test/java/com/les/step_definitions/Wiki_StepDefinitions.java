package com.les.step_definitions;

import com.les.pages.WikipediaPage;
import com.les.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinitions {

    WikipediaPage wikipediaPage =  new WikipediaPage();

    @When("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {

        Driver.getDriver().get("https://www.wikipedia.org");


    }
    @Then("user types Steve Jobs in the search box")
    public void user_types_steve_jobs_in_the_search_box() {
        wikipediaPage.wikiSearchBox.sendKeys("Steve Jobs");
    }

    @Then("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.searchButton.click();
    }

    @Then("user should see Steve jobs in the wiki title")
    public void user_should_see_steve_jobs_in_the_wiki_title() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("Expected title to contain 'Steve Jobs' but was: " + actualTitle,
                actualTitle.contains("Steve Jobs"));
    }
}
