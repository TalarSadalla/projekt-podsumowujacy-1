package com.szymon.service;

import com.szymon.model.Link;
import com.szymon.model.Product;
import com.szymon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

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

    public Set<Link> findAllCategories() {
        List<Product> products = fetchAllProducts();
        Set<Link> categories= (products).stream()
                .map(e->e.getCategory())
                .map(e->new Link(StringUtils.capitalize(e),"/shop?category="+e))
                .collect(Collectors.toSet());
        return new TreeSet<>(categories);
    }

    public List<Product> findProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public void save(Product product){
        productRepository.save(product);
    }

}
