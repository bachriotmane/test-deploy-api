package org.fsts.fluttercleanarchapi.Repository;

import org.fsts.fluttercleanarchapi.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
