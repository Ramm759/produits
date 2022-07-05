package com.myjava.products.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCat;

    private String categoryName;
    private String description;


    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Product> products;

    public Category() {
    }

    public Category(String categoryName, String description, List<Product> products) {
        this.categoryName = categoryName;
        this.description = description;
        this.products = products;
    }

    public Long getIdCat() {
        return idCat;
    }

    public void setIdCat(Long idCat) {
        this.idCat = idCat;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String nomCat) {
        this.categoryName = nomCat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descriptionCat) {
        this.description = descriptionCat;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
