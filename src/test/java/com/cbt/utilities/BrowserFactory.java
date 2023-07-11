package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browser ) {

        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            if (browser.equalsIgnoreCase("safari")) {
                return null;
            } else if (browser.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            }
        } else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            if (browser.equalsIgnoreCase("edge")) {
                return null;
            } else if (browser.equalsIgnoreCase("safari")) {
                return new SafariDriver();
            }
        }

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
