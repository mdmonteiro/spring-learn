package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1034, BigDecimal.valueOf(150), 0.2));
		orders.add(new Order(2282, BigDecimal.valueOf(800), 0.1));
		orders.add(new Order(1309, BigDecimal.valueOf(95.9), 0));

		orders.stream().forEach(o -> System.out.println(
				"Pedido Código: " + o.getCode() + "\nValor Total: R$ " + orderService.total(o).setScale(2) + "\n"));
	}

}
