package com.example.jardineria.aplication.repository;

import com.example.jardineria.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
