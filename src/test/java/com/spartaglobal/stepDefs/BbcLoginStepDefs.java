package com.spartaglobal.stepDefs;

import com.spartaglobal.bbcSeleniumExample.BBCSite.BBCSite;
import com.spartaglobal.bbcSeleniumExample.SeleniumConfig.SeleniumConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BbcLoginStepDefs {

    private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "C:\\Users\\NGeorgiev\\Downloads\\chromedriver_win32\\chromedriver.exe");
    private BBCSite bbcSite = new BBCSite(seleniumConfig.getDriver());
    //Scenario I receive a valid error message when using an incorrect password

    @Given("I am on the signing page")
    public void i_am_on_the_signing_page() {
        bbcSite.bbcSignInPage().goToSignInPage();
    }

    @When("I input a valid email")
    public void i_input_a_valid_email() {
        bbcSite.bbcSignInPage().inputUsername("jeremy@gmail.com");
    }

    @And("an invalid password")
    public void an_invalid_password() {
        bbcSite.bbcSignInPage().inputPassword("1234test");
    }

    @Then("I receive a valid error")
    public void i_receive_a_valid_error() {
        bbcSite.bbcSignInPage().submitButton();
        System.out.println(bbcSite.bbcSignInPage().getPasswordErrorMessageText());
    }

}
