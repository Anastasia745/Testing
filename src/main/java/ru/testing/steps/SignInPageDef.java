package ru.testing.steps;

import cucumber.api.java.en.Then;
import ru.miet.ConfProperties;
import ru.miet.UserConfig;
import ru.testing.SignInPage;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();


    @Then("Input login")
    public void inputLogin() {
        signInPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Input password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }
}
