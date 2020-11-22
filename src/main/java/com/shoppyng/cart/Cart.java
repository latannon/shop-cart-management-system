package com.shoppyng.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private static int DEFAULT_QUANTITY_ADDED_PRODUCT = 1;
    private Map<Product, Integer> productList = new HashMap<>();

    public Cart add(Product product) {
        return add(product, DEFAULT_QUANTITY_ADDED_PRODUCT);
    }

    public Cart add(Product product, int quantity) {
        productList.merge(product, quantity, Integer::sum);
        return this;
    }

    public Cart updateQuantity(Product product, int quantity) {
        productList.put(product, quantity);
        return this;
    }

    public Cart remove(Product product) {
        productList.remove(product);
        return this;
    }

    public int getTotalProductsCount() {
        return productList.values().stream().reduce(0, Integer::sum);
    }

    public int getTotalProductsAmount() {
        return productList.entrySet().stream().mapToInt((entry) -> entry.getKey().getPrice() * entry.getValue()).sum();
    }
}
