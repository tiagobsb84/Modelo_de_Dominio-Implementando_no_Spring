package com.tso.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tso.dominio.entities.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {

}
