package com.shoppyng.cart;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ProductTest {
    @Test
    public void equals() {
        assertThat(new Product("REF1", 30).equals(new Product("REF1", 30))).isTrue();
        assertThat(new Product("REF1", 30).equals(new Product("REF2", 30))).isFalse();
        assertThat(new Product("REF1", 30).equals(new Product("REF1", 40))).isFalse();
        assertThat(new Product("REF1", 30).equals(null)).isFalse();
        assertThat(new Product("REF1", 30).equals(new ProductLike("REF1", 40))).isFalse();
    }

    private class ProductLike {

        private String ref;
        private int price;
        public ProductLike(String ref, int price) {
            this.ref = ref;
            this.price = price;
        }
    }
}
