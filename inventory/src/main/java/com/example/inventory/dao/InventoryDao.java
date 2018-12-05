package com.example.inventory.dao;

import java.util.List;

import com.example.inventory.model.Inventory;

public interface InventoryDao {

	public List<Inventory> getInventoryUpdates();

	public String deleteProduct(String productId);

	public String addProduct(Inventory product);

	public boolean isProductAvailavle(String productId);

	public Inventory getProduct(String productId);

}
