package com.volvo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserController {

	
	@Autowired
	
	UserRepository   repository;
	
	
	@RequestMapping(value="/create")
	public Response create(User dept) {

		User saved = repository.save(dept);
		Response response = new Response();

		response.setData(saved);
		return response;
	}
	
	
	@RequestMapping(value="/retrieve")	
public Response retrieve (User dept){
		User saved = repository.findById(dept.getId());
		Response response = new Response();

		response.setData(saved);
		return response;		
	}
	
	
	@RequestMapping(value="/update")
public Response update (User dept){
		User saved = repository.save(dept);
		Response response = new Response();

		response.setData(saved);
		return response;

}
	
	
	@RequestMapping(value="/delete")
public Response delete (User dept){
	repository.delete(dept);
	Response response = new Response();

	response.setData("deleted");
	return response;
}
}
