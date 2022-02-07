package com.tso.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tso.dominio.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
