package com.product.serviceImpl;

import com.product.model.Product;
import com.product.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceImplTest {

    @Autowired
    private ProductService productService;

    @Test
    void shouldReturnProductById() {
        Product product = productService.getProductById(1L);
        assertNotNull(product);
        assertEquals(1L, product.getId());
        assertEquals("Laptop", product.getName());
    }

    @Test
    void shouldReturnAllProducts() {
        List<Product> products = productService.getAllProducts();
        assertFalse(products.isEmpty());
    }

}