package com.example.vedantu.service;

import com.example.vedantu.model.Order;


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
