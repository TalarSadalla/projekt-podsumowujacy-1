package com.szymon.service;

import com.szymon.model.Image;
import com.szymon.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {

    public List<Product> fetchAllProducts() {
        List<Product> products = new ArrayList<>();
        Image smallImage = new Image("http://1.bp.blogspot.com/-bqJPGSx7ENU/VaL620oawgI/AAAAAAAAFqY/y1PXHn4clB8/s1600/CatWinterLucky.jpg", "siberian cat", "http://1.bp.blogspot.com/-bqJPGSx7ENU/VaL620oawgI/AAAAAAAAFqY/y1PXHn4clB8/s1600/CatWinterLucky.jpg");
        Image bigImage = new Image("http://zoomia.pl/files/i/10/74/koty-sprzedam-maine-coon_big21560_10745773451331497885.jpg?galeria", "Siberian cat", "http://zoomia.pl/files/i/10/74/koty-sprzedam-maine-coon_big21560_10745773451331497885.jpg?galeria");
        products.add(new Product("Siberian cat", "This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 25.0, smallImage, bigImage));
        products.add(new Product("Siberian cat", "This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 25.0, smallImage, bigImage));
        products.add(new Product("Siberian cat", "This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 25.0, smallImage, bigImage));
        products.add(new Product("Siberian cat", "This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 25.0, smallImage, bigImage));
        products.add(new Product("Siberian cat", "This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 25.0, smallImage, bigImage));
        products.add(new Product("Siberian cat", "This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 25.0, smallImage, bigImage));
        products.add(new Product("Siberian cat", "This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 25.0, smallImage, bigImage));
        return products;
    }

}
