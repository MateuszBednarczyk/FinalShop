package com.example.finalshop;

import com.example.finalshop.Product.ProductServiceStart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ProductServiceStart.class)
public class FinalShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalShopApplication.class, args);
    }

}
