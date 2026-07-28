package com.product.serviceImpl;

import com.product.model.Product;
import com.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Product getProductById(Long id) {
        Product product = new Product();
        product.setId(id);
        product.setName("Laptop");
        product.setPrice(75000.0);
        product.setCategory("Electronics");
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Laptop", 75000.0, "Electronics"));
        products.add(new Product(2L, "Mobile", 25000.0, "Electronics"));
        products.add(new Product(3L, "Shoes", 3000.0, "Fashion"));
        return products;
    }
}
