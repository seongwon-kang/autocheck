package io.hardplant.lgecommon.member.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://member.lge.co.kr/
public class LoginPage {
    public static final String URL = "https://member.lge.co.kr/";
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}