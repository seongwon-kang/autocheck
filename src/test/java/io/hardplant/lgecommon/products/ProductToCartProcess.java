package io.hardplant.lgecommon.products;

import io.hardplant.lgecommon.obs.CartEnterType;

public class ProductToCartProcess {
    public ProductToCartProcess willTypeOfProductBeAdded(ProductType productType) {
        return this;
    }

    public ProductToCartProcess willGotoCartPageWith(CartEnterType cartEnterType) {
        return this;
    }

    public ProductToCartProcess willLoginDuringOrderWithCredentialOf(Object o) {
        return this;
    }

    public void proceedProductToCart() {
    }
}
