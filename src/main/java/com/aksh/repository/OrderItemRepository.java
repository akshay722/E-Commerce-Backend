package com.aksh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aksh.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
