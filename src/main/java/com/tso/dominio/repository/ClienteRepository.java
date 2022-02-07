package com.tso.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tso.dominio.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
