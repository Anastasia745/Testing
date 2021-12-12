package ru.testing;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public void clickButton() {
        $(By.xpath("//*[@id=\"passp-field-login\"]")).click();
    }

    public void clickSignIn() {
        $(By.xpath("//*[@id=\"passp:sign-in\"]")).click();
    }

    public void clickPassword() {
        $(By.xpath("//*[@id=\"passp-field-passwd\"]")).click();
    }

    public void clickElement() {
        $(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/header/div[2]/div[2]/div/div/a[1]/div/img")).click();
    }

    public void clickMail() {
        $(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/header/div[2]/div[2]/div/div/div/ul/ul/li[1]/a/span/span")).click();
    }

    public void clickLetter() {
        $(By.xpath("//*[@id=\"js-apps-container\"]/div[2]/div[7]/div/div[3]/div[2]/div[1]/div/div/div/a/span")).click();
    }

    public void clickWhom(){
        $(By.xpath("//*[@id=\"js-apps-container\"]/div[2]/div[10]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div/div/div/div/div")).click();
    }

    public void clickMyself(){
        $(By.xpath("//*[@id=\"js-apps-container\"]/div[2]/div[10]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]/div[1]/div[2]")).click();
    }

    public void clickSend(){
        $(By.xpath("//*[@id=\"js-apps-container\"]/div[2]/div[10]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/div[1]/button")).click();
    }

    public String clickDone(){
        return $(By.xpath("//*[@id=\"nb-1\"]/body/div[13]/div/div[2]/div[2]/span")).getText();
    }

    public void writeText(){
        $(By.xpath("//*[@id=\"js-apps-container\"]/div[2]/div[10]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[1]/div[3]/div/div/input")).sendKeys("Test");
    }

    public void sendInformation(){
        $(By.xpath("//*[@id=\"cke_1_contents\"]/div/div[1]")).sendKeys("Hello");
    }

}

