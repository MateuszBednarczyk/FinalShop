package com.example.finalshop;

import com.example.finalshop.Cart.CartService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private final CartService cartService;

    public MainService(CartService cartService) {
        this.cartService = cartService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void showCart(){

        System.out.println(cartService.createCart());

    }
}
