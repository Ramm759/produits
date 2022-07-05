package com.myjava.products.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;
    private String productName;
    private Double productPrice;
    private Date creationDate;

    @ManyToOne
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product() {
    }

    public Product(String productName, Double productPrice, Date creationDate) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", creationDate=" + creationDate +
                ", category=" + category.getDescription() +
                '}';
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduit) {
        this.idProduct = idProduit;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String nomProduit) {
        this.productName = nomProduit;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double prixProduit) {
        this.productPrice = prixProduit;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date dateCreation) {
        this.creationDate = dateCreation;
    }
}
