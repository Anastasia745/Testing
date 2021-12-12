package ru.testing.steps;


import cucumber.api.java.en.Then;
import ru.testing.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Click phone or email")
    public void clickPhone() {
        basicPage.clickButton();
    }

    @Then("Click sign-in")
    public void clickButtonSpan() {
        basicPage.clickSignIn();
    }

    @Then("Click password")
    public void contentWithVisible() {
        basicPage.clickPassword();
    }

    @Then("Click element")
    public void clicksmth() {
        basicPage.clickElement();
    }

    @Then("Click mail")
    public void clickMail() {
        basicPage.clickMail();
    }

    @Then("Click new letter")
    public void clickLetter() {
        basicPage.clickLetter();
    }

    @Then("Click whom")
    public void clickWhom() {
        basicPage.clickWhom();
    }

    @Then("Click myself")
    public void clickMe() {
        basicPage.clickMyself();
    }

    @Then("Click send")
    public void clickSend() {
        basicPage.clickSend();
    }

    @Then("Click done")
    public void clickDone() {

        System.out.println( basicPage.clickDone());
    }

    @Then("Write title")
    public void writeLetter(){
        basicPage.writeText();
    }

    @Then("Write text")
    public void writeInformation(){
        basicPage.sendInformation();
    }
}
