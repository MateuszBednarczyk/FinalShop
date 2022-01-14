package com.example.finalshop;

import com.example.finalshop.Product.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ProductService.class)
public class FinalShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalShopApplication.class, args);
    }

}
