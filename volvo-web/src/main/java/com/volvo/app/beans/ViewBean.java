package com.volvo.app.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ViewBean {
	
	int id;
	
	String name;
	
	String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	
	public void getUser(){
		
		this.id=1;
		
		this.name="admin";
		
		this.description="adminstrator";
	}


}
