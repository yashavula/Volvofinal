package com.volvo.app;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
@Entity
public class User {

	
	Long id;
	
	String name;
	
	String description;
	
	Set<Permission>  permissions=new HashSet<>();
	
	
	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
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
