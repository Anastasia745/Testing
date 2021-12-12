package ru.miet;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChromeTest {
    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void authorizationVote() throws InterruptedException {
        //driver.get("https://account.mail.ru/login");
        driver.get("https://passport.yandex.ru/auth/welcome");
        TimeUnit.SECONDS.sleep(5);


        //WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/form/div[2]/div/div[1]/div/div/div/div/div/div[1]/div/input"));
        WebElement login = driver.findElement(By.xpath("//*[@id=\"passp-field-login\"]"));
        login.sendKeys(ConfProperties.getProperty("login"));
        //WebElement next = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/form/div[2]/div/div[3]/div/div/div[1]/button/span"));
        WebElement next = driver.findElement(By.xpath("//*[@id=\"passp:sign-in\"]"));
        next.click();
        TimeUnit.SECONDS.sleep(5);

        //WebElement password = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/form/div[2]/div/div[2]/div/div/div/div/div/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"passp-field-passwd\"]"));
        password.sendKeys(ConfProperties.getProperty("password"));
        //WebElement ok = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/form/div[2]/div/div[3]/div/div/div[1]/div/button/span"));
        WebElement ok = driver.findElement(By.xpath("//*[@id=\"passp:sign-in\"]"));
        ok.click();
        TimeUnit.SECONDS.sleep(7);

        /*WebElement profile = driver.findElement(By.xpath("//*[@id=\"ph-whiteline\"]/div/div[2]/div[2]/span[2]"));
        profile.click();
        TimeUnit.SECONDS.sleep(3);*/
        WebElement profile = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/header/div[2]/div[2]/div/div/a[1]/div/img"));
        profile.click();
        TimeUnit.SECONDS.sleep(3);

        WebElement mail = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/header/div[2]/div[2]/div/div/div/ul/ul/li[1]/a/span/span"));
        mail.click();
        TimeUnit.SECONDS.sleep(7);

        new Actions(driver).moveByOffset(345, 127).click().build().perform();
        TimeUnit.SECONDS.sleep(3);
        WebElement delete = driver.findElement(By.xpath("//*[@id=\"js-apps-container\"]/div[2]/div[7]/div/div[3]/div[3]/div[3]/div/div[2]/div[2]/div/div[2]/div/div/div[5]"));
        delete.click();
        TimeUnit.SECONDS.sleep(7);

        WebElement newLater = driver.findElement(By.xpath("//*[@id=\"js-apps-container\"]/div[2]/div[7]/div/div[3]/div[2]/div[1]/div/div/div/a/span"));
        newLater.click();
        TimeUnit.SECONDS.sleep(3);

        WebElement toWhom = driver.findElement(By.xpath("//*[@id=\"js-apps-container\"]/div[2]/div[10]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div/div/div/div/div"));
        toWhom.click();
        WebElement toMyself = driver.findElement(By.xpath("//*[@id=\"js-apps-container\"]/div[2]/div[10]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]/div[1]/div[2]"));
        toMyself.click();
        TimeUnit.SECONDS.sleep(3);

        WebElement topic = driver.findElement(By.xpath("//*[@id=\"js-apps-container\"]/div[2]/div[10]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[1]/div[3]/div/div/input"));
        topic.sendKeys("Test");
        TimeUnit.SECONDS.sleep(3);

        WebElement text = driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/div/div[1]"));
        text.sendKeys("Hello!");
        TimeUnit.SECONDS.sleep(3);

        WebElement send = driver.findElement(By.xpath("//*[@id=\"js-apps-container\"]/div[2]/div[10]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/div[1]/button"));
        send.click();
        TimeUnit.SECONDS.sleep(7);

        /*WebElement name = driver.findElement(By.xpath("//*[@id=\"ph-whiteline\"]/div/div[3]/div/div/div[1]/div/div[1]/div"));
        String answer = name.getText();
        Assert.assertEquals(answer,"Anastasia Gnibeda");*/

        WebElement done = driver.findElement(By.xpath("//*[@id=\"nb-1\"]/body/div[13]/div/div[2]/div[2]/span"));
        String answer = done.getText();
        Assert.assertEquals(answer, "Письмо отправлено");
    }


    @AfterClass
    public static void logOut() {
        driver.quit();
    }
}