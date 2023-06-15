package io.hardplant.lgecommon.display;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.lge.co.kr/tvs?catalogId=CD00000041
public class GNB {

    public SelenideElement myPageIcon = $x("/html/body/div[2]/div[2]/div/div/div/div/header/div[2]/div[1]/div[2]/ul/li[3]/a");

    public SelenideElement myPageLogin = $x("/html/body/div[2]/div[2]/div/div/div/div/header/div[2]/div[1]/div[2]/ul/li[3]/div/div/a[1]");
}