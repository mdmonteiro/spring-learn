package com.example.demo;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Order;
import com.example.demo.services.OrderService;

@SpringBootApplication
public class ClassApplication implements CommandLineRunner {

	private OrderService orderService;

	public ClassApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ClassApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1034 = new Order(1034, BigDecimal.valueOf(150), 0.2);
		Order order2282 = new Order(2282, BigDecimal.valueOf(800), 0.1);
		Order order1309 = new Order(1309, BigDecimal.valueOf(95.9), 0);

		System.out.println("Pedido Código: " + order1034.getCode() + "\n Valor Total: R$ "
				+ orderService.total(order1034).setScale(2) + "\n");
		System.out.println("Pedido Código: " + order2282.getCode() + "\n Valor Total: R$ "
				+ orderService.total(order2282).setScale(2) + "\n");
		System.out.println("Pedido Código: " + order1309.getCode() + "\n Valor Total: R$ "
				+ orderService.total(order1309).setScale(2) + "\n");

	}

}
