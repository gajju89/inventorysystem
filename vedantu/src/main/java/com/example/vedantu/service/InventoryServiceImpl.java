package com.example.vedantu.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.vedantu.dao.InventoryDao;
import com.example.vedantu.model.Inventory;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired InventoryDao inventoryDao;

	@Override
	@Transactional(readOnly=true)
	public List<Inventory> getInventoryUpdates() {
		
		return inventoryDao.getInventoryUpdates();
	}

	@Override
	@Transactional
	public String deleteProduct(String productId) {
		try {
			// fetching product from inventory
			Inventory productToDelete = inventoryDao.getProduct(productId);
			if (productToDelete != null) {
				//if product quantity is one
				if (productToDelete.getQuantity() <= 1) {
					return inventoryDao.deleteProduct(productId);
				} else {
					//if product quantity is more than one
					productToDelete.setQuantity(productToDelete.getQuantity() - 1);
					return inventoryDao.addProduct(productToDelete);

				}
			}
		} catch (Exception e) {
			// TODO logger implementation
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public String addProduct(Inventory product) {
		// TODO functionality to add  product to inventory
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public boolean isProductAvailavle(String productId) {
		// TODO functionality to check if product available
		return true;
	}
	
	

	

}
