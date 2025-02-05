package com.example.demo.entities;

import java.math.BigDecimal;

public class Order {

	private Integer code;
	private BigDecimal basicValue;
	private double discount;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public BigDecimal getBasicValue() {
		return basicValue;
	}

	public void setBasicValue(BigDecimal basicValue) {
		this.basicValue = basicValue;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Order() {
		// Constructor
	}

	public Order(Integer code, BigDecimal basicValue, double discount) {
		this.code = code;
		this.basicValue = basicValue;
		this.discount = discount;
	}

}
