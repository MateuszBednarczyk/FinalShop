package com.example.finalshop;

import com.example.finalshop.Cart.CartService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private final CartService cartService;
    private final ProfileManager activeProfile;

    public MainService(CartService cartService, ProfileManager activeProfile) {
        this.cartService = cartService;
        this.activeProfile = activeProfile;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void showCart(){

        System.out.println(activeProfile.getProfile());
        System.out.println(cartService.createCart());

    }
}
