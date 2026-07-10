package com.les.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BrowserUtils {

    public BrowserUtils() {}
    public static void sleep(int timeInSeconds) throws InterruptedException {
        timeInSeconds *= 1000;

        try {
            Thread.sleep((long)timeInSeconds);
        } catch (InterruptedException var2) {
        }

    }

    public static void verifyTitle( String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void verifyTitleContains( String expectedContains) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedContains));
    }

    public static void switchWindowAndVerifyURLContains( String expectedURL, String expectedTitle) {
        for(String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL = " + Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedURL)) {
                break;
            }
        }

    }
}
