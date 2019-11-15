package com.spartaglobal.bbcSeleniumExample.SeleniumConfig;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumConfig {
    private WebDriver driver;

    public SeleniumConfig(String browser, String driverPath) {
        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",driverPath);
            driver = new ChromeDriver();
        }
    }
    public void setImplicitWaitTime(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public void setWindowSize(int length, int height){
        driver.manage().window().setSize(new Dimension(length,height));
    }

    public WebDriver getDriver() {
        return driver;
    }
}