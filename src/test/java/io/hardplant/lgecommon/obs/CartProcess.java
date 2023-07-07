package io.hardplant.lgecommon.obs;

import io.hardplant.lgecommon.products.ProductType;

public class CartProcess {
    public CartProcess willNotApplyCoupon() {
        return this;
    }

    public CartProcess willApplyCouponTo(ProductType productType) {
        return this;
    }
}
