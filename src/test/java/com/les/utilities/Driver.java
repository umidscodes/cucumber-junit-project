package com.les.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

        private static WebDriver driver;

        private Driver() {
        }

        public static WebDriver getDriver() {
            if (driver == null) {
                switch (ConfigurationReader.getProperty("browser")) {
                    case "chrome":
                        //WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
                        break;
                    case "firefox":
                        //WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
                        break;
                    case "edge":
                        //WebDriverManager.edgedriver().setup();
                        driver = new EdgeDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
                        break;
                    case "safari":
                        //WebDriverManager.safaridriver().setup();
                        driver = new SafariDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
                }
            }

            return driver;
        }

        public static void closeDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }

        }
    }


