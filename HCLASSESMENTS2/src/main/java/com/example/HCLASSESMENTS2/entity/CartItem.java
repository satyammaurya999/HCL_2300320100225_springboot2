package com.example.HCLASSESMENTS2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CartItemid;
    private Cart cart;
    private Integer quantity;
    private Double price;
    public Long getCartItemid() {
        return CartItemid;
    }

    public void setCartItemid(Long cartItemid) {
        CartItemid = cartItemid;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Product product;

    public CartItem(Long cartItemid, Cart cart, Product product, Integer quantity, Double price) {
        CartItemid = cartItemid;
        this.cart = cart;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }




}
