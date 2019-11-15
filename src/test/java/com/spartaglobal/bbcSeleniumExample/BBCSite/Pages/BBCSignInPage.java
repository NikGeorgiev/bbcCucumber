package com.spartaglobal.bbcSeleniumExample.BBCSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BBCSignInPage {
    private WebDriver driver;
    private String pageURL = "https://account.bbc.com/signin";
    private By usernameTextId = By.id("user-identifier-input");
    private By passwordTextId = By.id("password-input");
    private By submitButtonId = By.id("submit-button");
    private By usernameFieldId = By.id("form-message-username");
    private By passwordFieldId = By.id("form-message-password");
    private By passwordTextFieldId = By.id("password-input");

    public BBCSignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public BBCSignInPage goToSignInPage(){
        driver.navigate().to(pageURL);
        return this;
    }

    public BBCSignInPage inputUsername(String username){
        driver.findElement(usernameTextId).sendKeys(username);
        return this;
    }

    public BBCSignInPage inputPassword(String password){
        driver.findElement(passwordTextId).sendKeys(password);
        return this;
    }

    public BBCSignInPage submitButton(){
     driver.findElement(submitButtonId).click();
       return this;
    }

    public String getUsernameErrorMessageText(){
        return driver.findElement(usernameFieldId).getText();
    }

    public String getPasswordErrorMessageText(){
        return driver.findElement(passwordFieldId).getText();
    }

    public BBCSignInPage sendTabKey(){
         driver.findElement(passwordTextFieldId).sendKeys(Keys.TAB);
         return this;
    }
}
