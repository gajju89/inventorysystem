package com.example.inventory.service;

import com.example.inventory.model.Order;


public interface OrderService {
	
	/**
	 * function for creating new order
	 * 
	 * @param order
	 * @return orderId
	 */
	public String createOrder(Order order);
	
	/**
	 * function for updatating order details
	 * @param order
	 * @return
	 */
	public Order updateOrder(Order order);

}
