package com.les.step_definitions;

import com.les.pages.GoogleSearchPage;
import com.les.utilities.BrowserUtils;
import com.les.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_step_definitions {

    GoogleSearchPage googleSearchPage =  new GoogleSearchPage();

    @When("user is on the google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("http://google.com");

    }
    @Then("user should see title is google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(expectedTitle, actualTitle);

        Driver.closeDriver();


    }

    @When("user searches for {word}")
    public void userSearchesForApple(String word) {
        googleSearchPage.searchBox.click();
        googleSearchPage.searchBox.sendKeys(word);
        googleSearchPage.searchBox.sendKeys(Keys.ENTER);

    }

    @Then("user should see {word} in the title")
    public void userShouldSeeAppleInTheTitle(String word) {
        BrowserUtils.verifyTitle(word + " - Google Search");
        System.out.println("______________________________");

    }
}
