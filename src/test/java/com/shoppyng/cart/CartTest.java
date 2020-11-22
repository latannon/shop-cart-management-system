package com.shoppyng.cart;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CartTest {

    @Test
    public void getTotalProductsCount_equals_0_when_cart_empty() {
        // Given
        Cart cart = new Cart();

        // When
        int totalProductsCount = cart.getTotalProductsCount();

        // Then
        assertThat(totalProductsCount).isEqualTo(0);
    }

    @Test
    public void getTotalProductsCount_equals_1_when_add_1_product_into_cart() {
        // Given
        Cart cart = new Cart();
        cart.add(new Product("REF1", 30));

        // When
        int totalProductCount = cart.getTotalProductsCount();

        // Then
        assertThat(totalProductCount).isEqualTo(1);
    }

    @Test
    public void getTotalProductsCount_equals_2_when_add_2_products_into_cart() {
        // Given
        Cart cart = new Cart();
        cart.add(new Product("REF1", 30))
                .add(new Product("REF2", 10));

        // When
        int totalProductCount = cart.getTotalProductsCount();

        // Then
        assertThat(totalProductCount).isEqualTo(2);
    }

    @Test
    public void getSubTotal_equals_0_when_cart_is_empty() {
        // Given
        Cart cart = new Cart();

        // When
        int subTotal = cart.getTotalProductsAmount();

        // Then
        assertThat(subTotal).isEqualTo(0);
    }

    @Test
    public void getSubTotal_equals_30_when_add_a_product_priced_30_into_cart() {
        // Given
        Cart cart = new Cart();
        int price = 30;
        cart.add(new Product("REF1", price));

        // When
        int subTotal = cart.getTotalProductsAmount();

        // Then
        assertThat(subTotal).isEqualTo(price);
    }

    @Test
    public void getSubTotal_equals_60_when_add_a_product_priced_60_into_cart() {
        // Given
        Cart cart = new Cart();
        int price = 60;
        cart.add(new Product("REF1", price));

        // When
        int subTotal = cart.getTotalProductsAmount();

        // Then
        assertThat(subTotal).isEqualTo(price);
    }

    @Test
    public void getTotalProductsCount_equals_2_when_add_only_one_product_with_quantity_2() {
        // Given
        Cart cart = new Cart();
        int quantity = 2;
        cart.add(new Product("REF1", 30), quantity);

        // When
        int totalProductsCount = cart.getTotalProductsCount();

        // Then
        assertThat(totalProductsCount).isEqualTo(quantity);
    }

    @Test
    public void getTotalProductsCount_equals_3_when_add_only_one_product_with_quantity_3() {
        // Given
        Cart cart = new Cart();
        int quantity = 3;
        cart.add(new Product("REF1", 30), quantity);

        // When
        int totalProductsCount = cart.getTotalProductsCount();

        // Then
        assertThat(totalProductsCount).isEqualTo(quantity);
    }

    @Test
    public void getTotalProductsCount_equals_2_when_add_same_product_twice() {
        // Given
        Cart cart = new Cart();
        Product product = new Product("REF1", 30);
        cart.add(product).add(product);

        // When
        int totalProductsCount = cart.getTotalProductsCount();

        // Then
        assertThat(totalProductsCount).isEqualTo(2);
    }

    @Test
    public void getTotalProductsCount_equals_2_when_update_already_added_product_quantity_to_2() {
        // Given
        Cart cart = new Cart();
        Product product = new Product("REF1", 30);
        cart.add(product);

        // When
        int updatedQuantity = 2;
        cart.updateQuantity(product, updatedQuantity);


        // Then
        assertThat(cart.getTotalProductsCount()).isEqualTo(updatedQuantity);
    }

    @Test
    public void getTotalProductsCount_equals_0_when_removing_only_one_product_in_cart() {
        // Given
        Cart cart = new Cart();
        Product product = new Product("REF1", 30);
        cart.add(product);

        // When
        cart.remove(product);

        // Then
        assertThat(cart.getTotalProductsCount()).isEqualTo(0);
    }

    @Test
    public void getTotalProductsCount_equals_1_when_removing_one_product_from_two_in_cart() {
        // Given
        Cart cart = new Cart();
        Product product1 = new Product("REF1", 30);
        Product product2 = new Product("REF2", 50);
        cart.add(product1);
        cart.add(product2);

        // When
        cart.remove(product1);

        // Then
        assertThat(cart.getTotalProductsCount()).isEqualTo(1);
    }

}
