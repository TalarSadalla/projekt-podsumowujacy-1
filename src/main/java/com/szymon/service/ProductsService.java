package com.szymon.service;

import com.szymon.model.Image;
import com.szymon.model.Product;
import com.szymon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductRepository productRepository;

    public Product findProductById(Long id) {
        return productRepository.findOne(id);
    }

    public List<Product> fetchAllProducts() {
        List<Product> products = new ArrayList<>();
        Iterable<Product> iterable = productRepository.findAll();
        iterable.forEach(products::add);
        return products;
    }

    public List<Product> findProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }



}
