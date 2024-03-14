package com.example.jardineria.aplication.repository;

import com.example.jardineria.domain.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
