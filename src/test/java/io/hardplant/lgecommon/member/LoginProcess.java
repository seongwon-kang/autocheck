package io.hardplant.lgecommon.member;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.commands.Hover;
import io.hardplant.lgecommon.display.GNB;

import javax.swing.*;

import static com.codeborne.selenide.Selenide.actions;

public class LoginProcess {

    public static void proceed() {
        GNB gnb = new GNB();

        actions().moveToElement(gnb.myPageIcon).perform();
        gnb.myPageLogin.click();
    }


    public String password() {
        String input = JOptionPane.showInputDialog(null, "Enter password:");

        return input;
    }
}
