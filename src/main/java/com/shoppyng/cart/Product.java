package com.shoppyng.cart;

import java.util.Objects;

public class Product {

    private String ref;
    private int price;

    public Product(String ref, int price) {
        this.ref = ref;
        this.price = price;
    }

    public String getRef() {
        return ref;
    }

    public int getPrice() {
        return price;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Product) {
            Product product = (Product) obj;
            return product.ref.equals(ref) && product.price == price;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref, price);
    }
}
