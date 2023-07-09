package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class StringUtilities {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new SafariDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://google.com");

        WebElement googleSearchBox= driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("safari"+ Keys.ENTER);

        String expected = "safari";
        String actual= driver.getTitle();
        if (actual.equals(expected)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        driver.close();

    }
}
