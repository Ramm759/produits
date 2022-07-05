package com.myjava.products.service;

import com.myjava.products.entities.Product;
import com.myjava.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> getProduct(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findByProductName(String productName) {
        return productRepository.findByProductName(productName);
    }

    @Override
    public List<Product> findByProductNameContains(String productName) {
        return productRepository.findByProductNameContains(productName);
    }

    @Override
    public List<Product> findByProductNameAndProductPrice(String productName, Double price) {
        return productRepository.findByProductNameAndProductPrice(productName, price);
    }

    @Override
    public List<Product> findByCategory_IdCat(Long idCat) {
        return productRepository.findByCategory_IdCat(idCat);
    }
}
