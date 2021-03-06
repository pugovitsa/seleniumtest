package com.testtask.selenium.config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class SeleniumConfig {

    private WebDriver driver;
    public SeleniumConfig() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("somename", true);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

//    static {
//        System.setProperty("webdriver.gecko.driver", findFile("geckodriver.mac"));
//    }

    static private String findFile(String filename) {
        String paths[] = {"", "bin/", "target/classes"};
        for (String path : paths) {
            if (new File(path + filename).exists())
                return path + filename;
        }
        return "";
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}