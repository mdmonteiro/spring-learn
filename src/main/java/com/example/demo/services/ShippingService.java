package com.example.demo.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Order;

@Service
public class ShippingService {

	public BigDecimal calculateShip(Order order) {
		if (order.getBasicValue().compareTo(BigDecimal.valueOf(100)) < 0) {
			return BigDecimal.valueOf(20);
		} else if (order.getBasicValue().compareTo(BigDecimal.valueOf(100)) >= 0
				&& order.getBasicValue().compareTo(BigDecimal.valueOf(200)) <= 0) {
			return BigDecimal.valueOf(12);
		}

		return BigDecimal.ZERO;
	}

}
