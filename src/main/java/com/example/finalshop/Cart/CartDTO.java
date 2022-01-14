package com.example.finalshop.Cart;

import com.example.finalshop.Product.ProductDTO;

import java.util.Arrays;
import java.util.List;

public class CartDTO {
    private List<ProductDTO> shoppingCart = Arrays.asList();

    public CartDTO(List<ProductDTO> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<ProductDTO> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<ProductDTO> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() {
        return "CartDTO{" +
                "shoppingCart=" + shoppingCart +
                '}';
    }
}
