package com.example.inventory.dao;

import com.example.inventory.model.Order;

public interface OrderDao {
	
public String createOrder(Order order);	
public Order updateOrder(Order order);


}
