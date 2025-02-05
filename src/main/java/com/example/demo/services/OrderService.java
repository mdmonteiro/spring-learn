package com.example.demo.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;

	public BigDecimal total(Order order) {
		BigDecimal discountValue = order.getBasicValue().multiply(BigDecimal.valueOf(order.getDiscount()));
		order.setBasicValue(order.getBasicValue().subtract(discountValue));
		order.setBasicValue(order.getBasicValue().add(shippingService.calculateShip(order)));
		return order.getBasicValue();
	}

}
