package io.hardplant.lgecommon.display.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.lge.co.kr/
public class PLPPage {
    public String randomPLPURL = "https://www.lge.co.kr/tvs?catalogId=CD00000041";

    @FindBy(xpath = "//label[.//input[@name='chk-wish']]")
    public WebElement 위시리스트;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement 로그인확인버튼;

    public PLPPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}