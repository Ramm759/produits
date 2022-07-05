package com.myjava.products.service;

import com.myjava.products.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product saveProduct(Product p);
    Product updateProduct(Product p);
    void deleteProduct(Product p);
    void deleteProductById(Long id);
    Optional<Product> getProduct(Long id);
    List<Product> getAllProducts();
    List<Product> findByProductName(String productName);
    List<Product> findByProductNameContains(String productName);
    List<Product> findByProductNameAndProductPrice (String productName, Double price);
    List<Product> findByCategory_IdCat(Long id);
}
