package com.myjava.products.restcontrollers;

import com.myjava.products.entities.Product;
import com.myjava.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// Url : http://localhost:8080/product/api

@RestController
@RequestMapping("/api")
public class ProductRestController {
    @Autowired
    ProductService productService;

    @GetMapping
    List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping(value="/{id}")
    public Optional<Product> getProductById(@PathVariable("id") Long id) {
        return productService.getProduct(id);
    }

    // TODO : voir pour valorisation catégorie
    @PostMapping
    public Product createProduct(@RequestBody Product Product) {
        return productService.saveProduct(Product);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product Product) {
        return productService.updateProduct(Product);
    }

    @DeleteMapping(value="/{id}")
    public void deleteProduct(@PathVariable("id") Long id)
    {
        productService.deleteProductById(id);
    }

    @RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
    public List<Product> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
        return productService.findByCategory_IdCat(idCat);
    }
}
