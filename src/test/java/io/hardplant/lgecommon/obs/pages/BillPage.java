package io.hardplant.lgecommon.obs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://www.lge.co.kr/tvs?catalogId=CD00000041
public class BillPage {
    public BillPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void 결제하기() {
    }
}