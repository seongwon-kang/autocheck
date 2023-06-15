package io.hardplant.lgecommon.obs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://www.lge.co.kr/my-page/order-status
public class OrderList {
    String url = "https://www.lge.co.kr/my-page/order-status";

    @FindBy(xpath = "//*[text() = 'LGE.COM 구매']")
    public WebElement 구매탭;

    @FindBy(xpath = "//div[@data-id='0']")
    public List<WebElement> 첫번째주문카드;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div[4]/div[1]/div[1]/ul/li[2]")
    public WebElement 주문번호;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div[4]/div[1]/div[2]/div[2]/div/div/div[2]/div/p")
    public WebElement 결제금액;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div[4]/div[1]/div[2]/div[2]/div/div/div[3]/div/p")
    public WebElement 주문상태;

    @FindBy(css = "html > body > div:nth-of-type(1) > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(4) > div:nth-of-type(1) > div:nth-of-type(3) > a:nth-of-type(1)")
    public WebElement 취소신청버튼;

    @FindBy(xpath = "//button[@data-role='cancel']")
    public WebElement 가상계좌여부취소버튼;

    @FindBy(xpath = "/html/body/div[2]/article/section/div[3]/div/dl[1]/dd/div/div/div[1]/a")
    public WebElement 취소사유셀렉트박스;

    @FindBy(xpath = "/html/body/div[2]/article/section/div[3]/div/dl[1]/dd/div/div/div[2]/div[1]/ul/li[6]")
    public WebElement 취소사유기타;

    @FindBy(xpath = "//*[@id='changedTextInput']")
    public WebElement 취소사유텍스트;

    @FindBy(xpath = "/html/body/div[2]/article/div[2]/div/button[2]")
    public WebElement 취소사유확인;

    public OrderList(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void 주문및가격정보() {
        
    }
}