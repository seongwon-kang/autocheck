package io.hardplant.lgecommon.tests.payment;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.hardplant.lgecommon.MainPage;
import io.hardplant.lgecommon.display.pages.ObjectCollectionPage;
import io.hardplant.lgecommon.member.LoginProcess;
import io.hardplant.lgecommon.obs.pages.BillPage;
import io.hardplant.lgecommon.obs.pages.CartPage;
import io.netty.buffer.search.AhoCorasicSearchProcessorFactory;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class PaymentTests {
    MainPage mainPage = new MainPage();
    private ObjectCollectionPage objectCollectionPage;
    private CartPage cartPage;
    private BillPage billPage;

    @BeforeClass
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeMethod
    public void setUp() {
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("https://www.lge.co.kr/");

        objectCollectionPage = new ObjectCollectionPage(Selenide.webdriver().driver().getWebDriver());
        cartPage = new CartPage(Selenide.webdriver().driver().getWebDriver());
        billPage = new BillPage(Selenide.webdriver().driver().getWebDriver());

    }



    @Test
    public void 회원_일반_바로구매_가상계좌_포인트_오브제컬렉션() {
        LoginProcess.proceed();

        objectCollectionPage.두개_바로주문();

        // 완료시 주문서 이동

        cartPage.주문하기();

        billPage.결제하기();

    }

    @Test
    public void toolsMenu() {
        mainPage.toolsMenu.click();

        $("div[data-test='main-submenu']").shouldBe(visible);
    }

    @Test
    public void navigationToAllTools() {
        mainPage.seeDeveloperToolsButton.click();
        mainPage.findYourToolsButton.click();

        $("#products-page").shouldBe(visible);

        assertEquals(Selenide.title(), "All Developer Tools and Products by JetBrains");
    }
}
