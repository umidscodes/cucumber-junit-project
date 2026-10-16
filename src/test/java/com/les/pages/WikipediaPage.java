package com.les.pages;

import com.les.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    public WikipediaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "searchInput")
    public WebElement wikiSearchBox;

    @FindBy(xpath = "//*[@id=\"search-form\"]/fieldset/button")
    public WebElement searchButton;

}
