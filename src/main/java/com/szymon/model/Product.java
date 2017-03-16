package com.szymon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
public class Product {

//    @Id
//    @GeneratedValue
    private Long id;

    private String title;

//    @Column(length = 1023)
    private String description;

    private Double price;

    private Image smallImage;

    private Image bigImage;

    public Product() {
    }

    public Product(String title, String description, Double price, Image smallImage, Image bigImage) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.smallImage = smallImage;
        this.bigImage = bigImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Image getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(Image smallImage) {
        this.smallImage = smallImage;
    }

    public Image getBigImage() {
        return bigImage;
    }

    public void setBigImage(Image bigImage) {
        this.bigImage = bigImage;
    }
}
