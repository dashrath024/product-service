package com.product.service;

import com.product.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    void shouldReturnProductById() {

        Product product = productService.getProductById(1L);

        assertNotNull(product);
        assertEquals(1L, product.getId());
        assertEquals("Laptop", product.getName());
    }
}