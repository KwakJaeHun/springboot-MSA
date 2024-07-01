package com.jhkwak.orderservice.repository.product;

import com.jhkwak.orderservice.entity.product.Product;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByIdIn(List<Long> productIds);
}