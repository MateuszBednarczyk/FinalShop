package com.example.finalshop.Product;

import java.util.List;

public interface ProductService {

    double getFirst();
    void setFirst(double value);

    double getSecond();
    void setSecond(double value);

    double getThird();
    void setThird(double value);

    List<ProductDTO> findAllProducts();
}
