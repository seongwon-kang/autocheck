package io.hardplant.lgecommon.display.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://www.lge.co.kr/
public class ObjectCollectionPage {
    public ObjectCollectionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void 두개_바로주문() {
    }
}