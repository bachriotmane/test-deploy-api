package org.fsts.fluttercleanarchapi.Service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.fsts.fluttercleanarchapi.Entity.Product;
import org.fsts.fluttercleanarchapi.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Long id){
        return productRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Producr with id "+ id +" not found"));
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
