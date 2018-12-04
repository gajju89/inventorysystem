package com.example.vedantu.controller;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vedantu.model.Inventory;
import com.example.vedantu.service.InventoryService;


@RestController
@RequestMapping("/inventory")
public class InventoryController {
	
	@Autowired
	InventoryService inventoryService;

	    @RequestMapping("/status")
	    public Response getInventoryStatus() {
	    List<Inventory> inventory=inventoryService.getInventoryUpdates();
	    return Response.status(Status.OK).entity(inventory).build();
	    }
	    
	    @RequestMapping("/add/product")
	    public Response updateInventoryStatus(@RequestBody Inventory product) {
	    	//TODO service for inventory update
	    	String productId=inventoryService.addProduct(product);
	    return Response.status(Status.OK).entity(productId).build();
	    }

}
