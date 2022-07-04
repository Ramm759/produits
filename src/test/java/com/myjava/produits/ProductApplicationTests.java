package com.myjava.produits;

import com.myjava.produits.entities.Category;
import com.myjava.produits.entities.Product;
import com.myjava.produits.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ProductApplicationTests {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testCreateProduit() {
        Product product = new Product("PC Asus",1500.500,new Date());
        productRepository.save(product);
    }

    @Test
    public void testFindProduit()
    {
        Product product = productRepository.findById(2L).get();
        // TODO : Gérer absence de résultat
        System.out.println(product);
    }

    @Test
    public void testUpdateProduit()
    {
        Product p = productRepository.findById(1L).get();
        p.setProductPrice(2000.0);
        productRepository.save(p);

        System.out.println(p);
    }

    @Test
    public void testDeleteProduit()
    {
        productRepository.deleteById(1L);
    }

    @Test
    public void testFindAllProduits()
    {
        List<Product> prods = productRepository.findAll();

        for (Product p:prods)
            System.out.println(p);

    }


    @Test
    public void testFindProduitByProductName()
    {
        List<Product> products = productRepository.findByProductName("PS 4");

        for (Product p:products)
            System.out.println(p);

    }


    @Test
    public void testFindProduitByNomContains()
    {
        List<Product> products = productRepository.findByProductNameContains("P");

        for (Product product:products)
            System.out.println(product);

    }

    @Test
    public void testfindByNomPrix()
    {
        List<Product> products = productRepository.findByProductNameAndProductPrice("PS 4", 1500.5);
        for (Product product : products)
        {
            System.out.println(product);
        }
    }

    @Test
    public void findByCategorieIdCat()
    {
        List<Product> products = productRepository.findByCategory_IdCat(1L);
        for (Product product : products)
        {
            System.out.println(product);
        }
    }

/*
    @Test
    public void testfindByOrderByNomProduitAsc()
    {
        List<Produit> prods =  produitRepository.findByOrderByNomProduitAsc();
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }

    @Test
    public void testTrierProduitsNomsPrix()
    {
        List<Produit> prods = produitRepository.trierProduitsNomsPrix();
        for (Produit p : prods)
        {
            System.out.println(p);

    }}*/




}
