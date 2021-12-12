package ru.testing.steps;

import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    @Before
    public void openUrl() {
        open("https://passport.yandex.ru/auth/welcome");
    }
}
