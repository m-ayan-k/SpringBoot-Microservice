package com.mayank.order_service.repository;

import com.mayank.order_service.modal.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
