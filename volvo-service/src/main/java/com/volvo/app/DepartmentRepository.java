package com.volvo.app;

import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

	
	public Department findById(Long id);
}
