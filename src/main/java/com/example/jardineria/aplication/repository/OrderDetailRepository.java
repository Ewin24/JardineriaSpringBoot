package com.example.jardineria.aplication.repository;

import com.example.jardineria.domain.entities.OrderDetail;
import com.example.jardineria.domain.entities.OrderDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailPK> {
}
