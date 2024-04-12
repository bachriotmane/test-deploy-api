package org.fsts.fluttercleanarchapi;

import org.fsts.fluttercleanarchapi.Entity.Product;
import org.fsts.fluttercleanarchapi.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlutterCleanArchApiApplication {
    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(FlutterCleanArchApiApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(){
        return args ->{
            Product product = new Product();
            product.setProductDesc("test");
            product.setProductName("Test Name");
            product.setProductPrice(1000);
            productRepository.save(product);
        };
    }
}
