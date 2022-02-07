package com.tso.dominio;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tso.dominio.entities.Cliente;
import com.tso.dominio.entities.Order;
import com.tso.dominio.entities.OrderStatus;
import com.tso.dominio.entities.Produtos;
import com.tso.dominio.repository.ClienteRepository;
import com.tso.dominio.repository.OrderRepository;
import com.tso.dominio.repository.ProdutoRepository;

@SpringBootApplication
public class DominioApplication implements CommandLineRunner {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(DominioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cliente c1 = new Cliente(null, "Tiago Silva", "tiagobsb31@gmail.com");
		
		clienteRepository.save(c1);
		
		Produtos p1 = new Produtos(null, "TV", 3500.00);
		Produtos p2 = new Produtos(null, "Mouse", 50.00);
		Produtos p3 = new Produtos(null, "Computador", 2200.00);
		
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		Order o1 = new Order(null, Instant.parse("2202-04-21T11:24:43Z"), OrderStatus.PAGO, c1);
		
		orderRepository.saveAll(Arrays.asList(o1));
	}	
}
