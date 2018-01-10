package com.volvo.app;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Department {

	
	Long id;
	
	String name;
	
	String description;
	
	Set<User> users=new HashSet<>();

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
