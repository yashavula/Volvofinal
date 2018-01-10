package com.volvo.app;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


	
	public User findById(Long id);

}
