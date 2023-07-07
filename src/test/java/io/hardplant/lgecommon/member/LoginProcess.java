package io.hardplant.lgecommon.member;

import io.hardplant.lgecommon.display.GNB;

import javax.swing.*;

import static com.codeborne.selenide.Selenide.actions;

public class LoginProcess {

    private LoginType logintype;

    public static void proceed() {
        GNB gnb = new GNB();

        actions().moveToElement(gnb.myPageIcon).perform();
        gnb.myPageLogin.click();
    }


    public String password() {
        String input = JOptionPane.showInputDialog(null, "Enter password:");

        return input;
    }

    public LoginProcess WillSetLoginTypeTo(LoginType logintype) {
        this.logintype = logintype;

        return this;
    }

    public void proceedLogin() {
        if (logintype.equals(LoginType.NON_MEMBER)) return;
    }
}
