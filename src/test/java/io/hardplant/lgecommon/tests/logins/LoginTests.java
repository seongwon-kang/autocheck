package io.hardplant.lgecommon.tests.logins;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.hardplant.lgecommon.MainPage;
import io.hardplant.lgecommon.display.pages.PLPPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class LoginTests {
    public String BaseURL = "https://www.lge.co.kr";
    MainPage mainPage = new MainPage();

    @BeforeClass
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeMethod
    public void setUp() {
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open(BaseURL);
    }

    @Test
    public void TC_SL_012() {
        PLPPage plp = new PLPPage(Selenide.webdriver().driver().getWebDriver());
        plp.위시리스트.click();
        plp.로그인확인버튼.click();
    }
}
