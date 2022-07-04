package com.myjava.produits.service;

import com.myjava.produits.entities.Category;
import com.myjava.produits.entities.Product;
import com.myjava.produits.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduit(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduit(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduit(Product product) {
        productRepository.delete(product);
    }

    @Override
    public void deleteProduitById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> getProduit(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getAllProduits() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findByNomProduit(String nom) {
        return null;
    }

    @Override
    public List<Product> findByNomProduitContains(String nom) {
        return null;
    }

    @Override
    public List<Product> findByNomPrix(String nom, Double prix) {
        return null;
    }

    @Override
    public List<Product> findByCategorie(Category category) {
        return null;
    }

    @Override
    public List<Product> findByCategorieIdCat(Long id) {
        return null;
    }

    @Override
    public List<Product> findByOrderByNomProduitAsc() {
        return null;
    }

    @Override
    public List<Product> trierProduitsNomsPrix() {
        return null;
    }
}
