package io.hardplant.lgecommon.rental;

import io.hardplant.lgecommon.obs.PaymentType;

public class CaringBillProcess {
    public CaringBillProcess willPayWith(ChunyakType creditCard) {
        return this;
    }

    public CaringBillProcess willPayWith(PaymentType paymentType) {
        return this;
    }
}
