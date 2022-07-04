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
    List<Product> findByNomProduit(String nom);
    List<Product> findByNomProduitContains(String nom);
    List<Product> findByNomPrix (String nom, Double prix);
    List<Product> findByCategorie (Category category);
    List<Product> findByCategorieIdCat(Long id);
    List<Product> findByOrderByNomProduitAsc();
    List<Product> trierProduitsNomsPrix();
}
