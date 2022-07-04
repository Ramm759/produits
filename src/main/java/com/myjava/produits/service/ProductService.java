package com.myjava.produits.service;

import com.myjava.produits.entities.Category;
import com.myjava.produits.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product saveProduit(Product p);
    Product updateProduit(Product p);
    void deleteProduit(Product p);
    void deleteProduitById(Long id);
    Optional<Product> getProduit(Long id);
    List<Product> getAllProduits();
    List<Product> findByProductName(String productName);
    List<Product> findByProductNameContains(String productName);
    List<Product> findByProductNameAndProductPrice (String productName, Double price);
    List<Product> findByCategory_IdCat(Long id);
}
