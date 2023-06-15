package io.hardplant.lgecommon.member;
import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class NonMemberProcess {

    public String PASS() {
        String input = JOptionPane.showInputDialog(null, "Enter PASS:");

        return input;
    }
}
