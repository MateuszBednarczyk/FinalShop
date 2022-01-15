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
    private double vat;
    private double special;

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getSpecial() {
        return special;
    }

    public void setSpecial(double special) {
        this.special = special;
    }

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
                new ProductDTO(1,"Tomb Raider", first*vat*special),
                new ProductDTO(2,"10000 rp to lol", second*vat*special),
                new ProductDTO(3,"2k valorant points", third*vat*special)
        );
    }

}
