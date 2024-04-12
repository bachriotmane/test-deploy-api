package org.fsts.fluttercleanarchapi.Controller;

import lombok.AllArgsConstructor;
import org.fsts.fluttercleanarchapi.Entity.Product;
import org.fsts.fluttercleanarchapi.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/products")
@RestController
public class ProductController {

    private final ProductService productService;

    @GetMapping("/")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getAllProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PostMapping("/")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}
