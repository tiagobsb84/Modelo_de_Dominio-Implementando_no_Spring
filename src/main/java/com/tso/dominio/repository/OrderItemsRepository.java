package com.tso.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tso.dominio.entities.OrderItems;

public interface OrderItemsRepository extends JpaRepository<OrderItems, Long> {

}
