package ru.miet;

import org.openqa.selenium.By;

public class Buttons {
    public By clickLogin() {
        return By.xpath("//*[@id=\"passp-field-login\"]");
    }

    public By clickNext() {
        return By.xpath("//*[@id=\"passp:sign-in\"]");
    }

    public By clickPassword() {
        return By.xpath("//*[@id=\"passp-field-passwd\"]");
    }
}
