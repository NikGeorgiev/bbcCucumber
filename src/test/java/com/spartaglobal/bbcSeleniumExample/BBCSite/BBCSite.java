package com.spartaglobal.bbcSeleniumExample.BBCSite;

import com.spartaglobal.bbcSeleniumExample.BBCSite.Pages.BBCHomePage;
import com.spartaglobal.bbcSeleniumExample.BBCSite.Pages.BBCSignInPage;
import org.openqa.selenium.WebDriver;


public class BBCSite {
    private WebDriver driver;
    private BBCHomePage bbcHomePage;
    private BBCSignInPage bbcSignInPage;

    public BBCSite(WebDriver driver) {
        this.driver = driver;
        this.bbcHomePage = new BBCHomePage(driver);
        this.bbcSignInPage = new BBCSignInPage(driver);
    }

    public BBCHomePage bbcHomePage(){
        return bbcHomePage;
    }

    public BBCSignInPage bbcSignInPage(){
        return bbcSignInPage;
    }
}
