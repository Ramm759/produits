package com.myjava.products.repository;

import com.myjava.products.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @NonNull
    List<Product> findByProductName(@NonNull String productName);

    List<Product> findByProductNameContains(String productName);

    List<Product> findByCategory_IdCat(Long idCat);



    List<Product> findByProductNameAndProductPrice(String productName, Double productPrice);
}
