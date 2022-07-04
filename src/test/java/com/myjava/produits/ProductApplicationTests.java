package com.myjava.produits;

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
        p.setPrixProduit(2000.0);
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


    /*@Test
    public void testFindProduitByNom()
    {
        List<Produit> prods = produitRepository.findByNomProduit("PS 4");

        for (Produit p:prods)
            System.out.println(p);

    }

    @Test
    public void testFindProduitByNomContains()
    {
        List<Produit> prods = produitRepository.findByNomProduitContains("P");

        for (Produit p:prods)
            System.out.println(p);

    }

    @Test
    public void testfindByNomPrix()
    {
        List<Produit> prods = produitRepository.findByNomPrix("PS 4", 1000.0);
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }


    @Test
    public void testfindByCategorie()
    {
        Categorie cat = new Categorie();
        cat.setIdCat(1L);

        List<Produit> prods = produitRepository.findByCategorie(cat);
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }

    @Test
    public void findByCategorieIdCat()
    {
        List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }


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
