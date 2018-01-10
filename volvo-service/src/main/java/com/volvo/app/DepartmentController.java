package com.volvo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DepartmentController {

	
	@Autowired
	
	DepartmentRepository   repository;
	
	
	@RequestMapping(value="/create")
	public Response create(Department dept) {

		Department saved = repository.save(dept);
		Response response = new Response();

		response.setData(saved);
		return response;
	}
	
	
	@RequestMapping(value="/retrieve")	
public Response retrieve (Department dept){
		Department saved = repository.findById(dept.getId());
		Response response = new Response();

		response.setData(saved);
		return response;		
	}
	
	
	@RequestMapping(value="/update")
public Response update (Department dept){
		Department saved = repository.save(dept);
		Response response = new Response();

		response.setData(saved);
		return response;

}
	
	
	@RequestMapping(value="/delete")
public Response delete (Department dept){
	repository.delete(dept);
	Response response = new Response();

	response.setData("deleted");
	return response;
}
}
