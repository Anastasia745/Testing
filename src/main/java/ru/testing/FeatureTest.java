package ru.testing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
        features = "src/main/java/ru/testing/features",
        glue = "ru.testing",
        tags = "@yandex")
public class FeatureTest {
}

