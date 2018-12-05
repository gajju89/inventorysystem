package com.example.inventory.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventory.model.Account;

@RestController
@RequestMapping("/user")
public class UserAccountController {
	
	@RequestMapping("/create")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUserAccount(@RequestBody Account userAccount) {
		
		//TODO service and dao layer
    return Response.status(Status.OK).entity("All order working fine").build();
    }

	//TODO service to update userAccount after order creation
}
