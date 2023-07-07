package io.hardplant.lgecommon.obs;

import io.hardplant.lgecommon.member.LoginType;

public class BillProcess {
    public BillProcess willPayWith(PaymentType paymentType) {
        return this;
    }

    public BillProcess willSetMembershipPoint() {
        return this;
    }

    public BillProcess willCancelProcess() {
        return this;
    }

    public BillProcess willMemberStatusOf(LoginType logintype) {
        return this;
    }
}
