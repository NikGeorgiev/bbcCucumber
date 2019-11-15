package com.spartaglobal.bbcSeleniumExample.BBCSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BBCHomePage {
    private WebDriver driver;
    private String homePageURL = "https://www.bbc.co.uk";
    private By signInLinkId = By.id("idcta-link");

    public BBCHomePage (WebDriver driver){
        this.driver = driver;
    }

    public BBCHomePage goToBBCHomePage(){
        driver.navigate().to(homePageURL);
        return this;
    }

    public BBCHomePage clickSignInLink(){
        driver.findElement(signInLinkId).click();
        return this;
    }

    public BBCHomePage closeDriver(){
        driver.close();
        return this;
    }
}
