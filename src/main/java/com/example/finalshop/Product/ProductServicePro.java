package com.example.finalshop.Product;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Profile("ProductServicePro")
@Primary
@ConfigurationProperties(prefix = "product-service-pro")
public class ProductServicePro implements ProductService {

    private double first;
    private double second;
    private double third;

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double getThird() {
        return third;
    }

    public void setThird(double third) {
        this.third = third;
    }

    public List<ProductDTO> findAllProducts() {
        return Arrays.asList(
                new ProductDTO(1,"Tomb Raider", first),
                new ProductDTO(2,"10000 rp to lol", second),
                new ProductDTO(3,"2k valorant points", third)
        );
    }

}
