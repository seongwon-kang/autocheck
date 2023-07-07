package io.hardplant.lgecommon.tests.payment;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.hardplant.lgecommon.member.LoginProcess;
import io.hardplant.lgecommon.member.LoginType;
import io.hardplant.lgecommon.obs.BillProcess;
import io.hardplant.lgecommon.obs.CartEnterType;
import io.hardplant.lgecommon.obs.CartProcess;
import io.hardplant.lgecommon.obs.PaymentType;
import io.hardplant.lgecommon.products.ProductToCartProcess;
import io.hardplant.lgecommon.products.ProductType;
import io.hardplant.lgecommon.rental.CaringBillProcess;
import io.hardplant.lgecommon.rental.ChunyakType;
import io.hardplant.lgecommon.tests.util.ServerType;
import io.hardplant.lgecommon.tests.util.ServerTypeLocator;
import io.qameta.allure.selenide.AllureSelenide;
import net.thucydides.core.annotations.Pending;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class PaymentRegressionTests {

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
    }


    @Test
    public void Regression_01() {
        LoginType logintype = LoginType.NON_MEMBER;
        ProductType productType = ProductType.Normal;
        CartEnterType cartEnterType = CartEnterType.PDPToCart;
        PaymentType paymentType = PaymentType.CreditCard;

        LoginProcess loginProcess = new LoginProcess()
                .WillSetLoginTypeTo(logintype);

        ProductToCartProcess productToCartProcess = new ProductToCartProcess()
                .willGotoCartPageWith(cartEnterType)
                .willTypeOfProductBeAdded(productType);

        CartProcess cartProcess = new CartProcess()
                .willNotApplyCoupon();

        BillProcess billProcess = new BillProcess()
                .willPayWith(paymentType);
    }

    @Test
    public void Regression_02() {
        LoginType logintype = LoginType.NON_MEMBER;
        ProductType productType = ProductType.NormalPlusAcc;
        CartEnterType cartEnterType = CartEnterType.PDPToCart;
        PaymentType paymentType = PaymentType.VirtualAccount;

        LoginProcess loginProcess = new LoginProcess()
                .WillSetLoginTypeTo(logintype);

        ProductToCartProcess productToCartProcess = new ProductToCartProcess()
                .willGotoCartPageWith(cartEnterType)
                .willTypeOfProductBeAdded(productType);

        CartProcess cartProcess = new CartProcess()
                .willNotApplyCoupon();

        BillProcess billProcess = new BillProcess()
                .willPayWith(paymentType);
    }

    @Test
    public void Regression_03() {
        LoginType logintype = LoginType.NON_MEMBER;
        ProductType productType = ProductType.Accesaries;
        CartEnterType cartEnterType = CartEnterType.PDPToCart;
        PaymentType paymentType = PaymentType.NaverPay;

        LoginProcess loginProcess = new LoginProcess()
                .WillSetLoginTypeTo(logintype);

        ProductToCartProcess productToCartProcess = new ProductToCartProcess()
                .willLoginDuringOrderWithCredentialOf(new Object())
                .willGotoCartPageWith(cartEnterType)
                .willTypeOfProductBeAdded(productType);

        CartProcess cartProcess = new CartProcess()
                .willApplyCouponTo(productType);

        BillProcess billProcess = new BillProcess()
                .willPayWith(paymentType);
    }

    @Test
    public void Regression_04() {
        LoginType logintype = LoginType.MEMBER;
        ProductType productType = ProductType.ObjetCollectionPanel;
        CartEnterType cartEnterType = CartEnterType.Instant;
        PaymentType paymentType = PaymentType.NaverPay;

        LoginProcess loginProcess = new LoginProcess()
                .WillSetLoginTypeTo(logintype);

        ProductToCartProcess productToCartProcess = new ProductToCartProcess()
                .willGotoCartPageWith(cartEnterType)
                .willTypeOfProductBeAdded(productType);

        CartProcess cartProcess = new CartProcess()
                .willNotApplyCoupon();

        BillProcess billProcess = new BillProcess()
                .willSetMembershipPoint()
                .willPayWith(paymentType);
    }

    @Test
    public void Regression_05() {
        LoginType logintype = LoginType.MEMBER;
        ProductType productType = ProductType.Normal;
        CartEnterType cartEnterType = CartEnterType.PDPToCart;
        PaymentType paymentType = PaymentType.CreditCard;

        LoginProcess loginProcess = new LoginProcess()
                .WillSetLoginTypeTo(logintype);

        ProductToCartProcess productToCartProcess = new ProductToCartProcess()
                .willGotoCartPageWith(cartEnterType)
                .willTypeOfProductBeAdded(productType);

        CartProcess cartProcess = new CartProcess()
                .willApplyCouponTo(productType);

        BillProcess billProcess = new BillProcess()
                .willPayWith(paymentType);
    }

    @Test
    @Pending
    public void Regression_06() {
        LoginType logintype = LoginType.MEMBER;
        ProductType productType = ProductType.Rental;
        CartEnterType cartEnterType = CartEnterType.Instant;

        ChunyakType creditCard = ChunyakType.CreditCard;

        LoginProcess loginProcess = new LoginProcess()
                .WillSetLoginTypeTo(logintype);

        ProductToCartProcess productToCartProcess = new ProductToCartProcess()
                .willGotoCartPageWith(cartEnterType)
                .willTypeOfProductBeAdded(productType);

        CartProcess cartProcess = new CartProcess();

        CaringBillProcess caringBillProcess = new CaringBillProcess()
                .willPayWith(creditCard);
    }

    @Test
    public void Regression_07() {
        LoginType logintype = LoginType.NON_MEMBER;
        ProductType productType = ProductType.Normal;
        CartEnterType cartEnterType = CartEnterType.PDPToCart;
        PaymentType paymentType = PaymentType.CreditCard;

        LoginProcess loginProcess = new LoginProcess()
                .WillSetLoginTypeTo(logintype);

        ProductToCartProcess productToCartProcess = new ProductToCartProcess()
                .willGotoCartPageWith(cartEnterType)
                .willTypeOfProductBeAdded(productType);

        CartProcess cartProcess = new CartProcess()
                .willApplyCouponTo(productType);

        BillProcess billProcess = new BillProcess()
                .willPayWith(paymentType)
                .willCancelProcess();
    }

    @Test
    public void Regression_08() {
        LoginType logintype = LoginType.NON_MEMBER;
        ProductType productType = ProductType.Normal;
        CartEnterType cartEnterType = CartEnterType.Instant;
        PaymentType paymentType = PaymentType.VirtualAccount;

        LoginProcess loginProcess = new LoginProcess()
                .WillSetLoginTypeTo(logintype);

        ProductToCartProcess productToCartProcess = new ProductToCartProcess()
                .willGotoCartPageWith(cartEnterType)
                .willTypeOfProductBeAdded(productType);

        CartProcess cartProcess = new CartProcess()
                .willNotApplyCoupon();

        BillProcess billProcess = new BillProcess()
                .willMemberStatusOf(logintype)
                .willPayWith(paymentType);
    }

    @Test
    public void Regression_09() {
        LoginType logintype = LoginType.NON_MEMBER;
        ProductType productType = ProductType.NormalPlusAcc;
        CartEnterType cartEnterType = CartEnterType.PDPToCart;
        PaymentType paymentType = PaymentType.KakaoPay;

        if (ServerTypeLocator.GetType().equals(ServerType.STG)) {
            paymentType = PaymentType.CreditCard;
        }

        LoginProcess loginProcess = new LoginProcess()
                .WillSetLoginTypeTo(logintype);

        ProductToCartProcess productToCartProcess = new ProductToCartProcess()
                .willLoginDuringOrderWithCredentialOf(new Object())
                .willGotoCartPageWith(cartEnterType)
                .willTypeOfProductBeAdded(productType);

        CartProcess cartProcess = new CartProcess()
                .willNotApplyCoupon();

        BillProcess billProcess = new BillProcess()
                .willPayWith(paymentType);
    }

    @Test
    public void Regression_10() {
        LoginType logintype = LoginType.MEMBER;
        ProductType productType = ProductType.AirconPlusPost;
        CartEnterType cartEnterType = CartEnterType.PDPToCart;
        PaymentType paymentType = PaymentType.VirtualAccount;

        LoginProcess loginProcess = new LoginProcess()
                .WillSetLoginTypeTo(logintype);

        ProductToCartProcess productToCartProcess = new ProductToCartProcess()
                .willLoginDuringOrderWithCredentialOf(new Object())
                .willGotoCartPageWith(cartEnterType)
                .willTypeOfProductBeAdded(productType);

        CartProcess cartProcess = new CartProcess()
                .willNotApplyCoupon();

        BillProcess billProcess = new BillProcess()
                .willPayWith(paymentType);
    }

    @Test
    public void Regression_11() {
        LoginType logintype = LoginType.MEMBER;
        ProductType productType = ProductType.Accesaries;
        CartEnterType cartEnterType = CartEnterType.Instant;
        PaymentType paymentType = PaymentType.VirtualAccount;

        LoginProcess loginProcess = new LoginProcess()
                .WillSetLoginTypeTo(logintype);

        ProductToCartProcess productToCartProcess = new ProductToCartProcess()
                .willGotoCartPageWith(cartEnterType)
                .willTypeOfProductBeAdded(productType);

        CartProcess cartProcess = new CartProcess()
                .willApplyCouponTo(productType);

        BillProcess billProcess = new BillProcess()
                .willPayWith(paymentType);
    }

    @Test
    public void Regression_12() {
        LoginType logintype = LoginType.MEMBER;
        ProductType productType = ProductType.NormalWithCareship;
        CartEnterType cartEnterType = CartEnterType.Instant;
        PaymentType paymentType = PaymentType.VirtualAccount;

        LoginProcess loginProcess = new LoginProcess()
                .WillSetLoginTypeTo(logintype);

        ProductToCartProcess productToCartProcess = new ProductToCartProcess()
                .willGotoCartPageWith(cartEnterType)
                .willTypeOfProductBeAdded(productType);

        CartProcess cartProcess = new CartProcess()
                .willNotApplyCoupon();

        CaringBillProcess billProcess = new CaringBillProcess()
                .willPayWith(paymentType);
    }
}
