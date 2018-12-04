package com.example.vedantu.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vedantu.model.Order;
import com.example.vedantu.service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;

	    @RequestMapping("/get/orders")
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getAllOrders() {
	    	//TODO fetch all orders details service
	    return Response.status(Status.OK).entity("All OK.").build();
	    }
	    
	    @RequestMapping("/get/order/{id}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getOrder(@PathVariable("id") String orderId) {
	    	//TODO fetch single order details service
	    return Response.status(Status.OK).entity("All order working fine").build();
	    }
	    
	    @POST
	    @Consumes(MediaType.APPLICATION_JSON)
	    @Produces(MediaType.APPLICATION_JSON)
	    @RequestMapping("/create")
	    public Response createOrder(@RequestBody Order order) {
	    	
	    	String orderId=orderService.createOrder(order);
	    	return Response.status(Status.OK).entity(orderId).build();
	        
	    }


}
