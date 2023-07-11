package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTest {

    public static void main(String[] args) {
        testChrome();
        testFirefox();
        testEdge();
    }

    public static void testChrome() {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        StringUtility.verifyEquals(expectedTitle, actualTitle);

        driver.get("https://etsy.com");

        expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        actualTitle = driver.getTitle();
        StringUtility.verifyEquals(expectedTitle, actualTitle);

        driver.navigate().back();
        actualTitle = driver.getTitle();
        StringUtility.verifyEquals(expectedTitle, actualTitle);

        driver.navigate().forward();
        actualTitle = driver.getTitle();
        StringUtility.verifyEquals(expectedTitle, actualTitle);

        driver.quit();
    }

    public static void testFirefox() {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        StringUtility.verifyEquals(expectedTitle, actualTitle);

        driver.get("https://etsy.com");

        expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        actualTitle = driver.getTitle();
        StringUtility.verifyEquals(expectedTitle, actualTitle);

        driver.navigate().back();
        actualTitle = driver.getTitle();
        StringUtility.verifyEquals(expectedTitle, actualTitle);

        driver.navigate().forward();
        actualTitle = driver.getTitle();
        StringUtility.verifyEquals(expectedTitle, actualTitle);

        driver.quit();
    }

    public static void testEdge() {
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        StringUtility.verifyEquals(expectedTitle, actualTitle);

        driver.get("https://etsy.com");

        expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        actualTitle = driver.getTitle();
        StringUtility.verifyEquals(expectedTitle, actualTitle);

        driver.navigate().back();
        actualTitle = driver.getTitle();
        StringUtility.verifyEquals(expectedTitle, actualTitle);

        driver.navigate().forward();
        actualTitle = driver.getTitle();
        StringUtility.verifyEquals(expectedTitle, actualTitle);

        driver.close();
    }
}
