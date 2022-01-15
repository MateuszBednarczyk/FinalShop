package com.example.finalshop.Cart;

import com.example.finalshop.Product.ProductDTO;
import com.example.finalshop.Product.ProductService;
import com.example.finalshop.ProfileManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final ProductService productService;

    @Autowired
    public CartService(ProductService productService) {
        this.productService = productService;
    }

    public CartDTO createCart(){
        List<ProductDTO> productList = productService.findAllProducts();
        return new CartDTO(productList);
    }

}
