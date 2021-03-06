# Shop cart management system

## Purpose

This project aims to init the implementation of a simple cart management system.
There fore we will focus mainly on the cart functionalities.

## Features

We can expect a buyer to be able to:

* add a product into the cart
* update a quantity of a product in the cart
* remove a product from the cart
* check the total quantity of products in the cart
* get total amount of products (order) in the cart
* can see the list of products and for each the quantity and price

Since we focus on the cart itself, we will assert a product has a unique reference, and a price

## Check implementation

To run tests:
>mvn clean test

## Cart implementation

### To do

* get list products in cart (ref, total amount, and quantity)
* remove a product when updated quantity <= 0
* not allow adding product with quantity <= 0

### Done

* check total count of products in cart
* check total amount of products in cart
* add product
* add a product with quantity
* check product equality
* update quantity of product
* add several time the same product increment quantity
* remove a product