package com.springBasics.app.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private Integer custId;
	private String custName;
	private String courseName;
	@Autowired
	private Technology tech;
	
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Technology getTech() {
		return tech;
	}
	public void setTech(Technology tech) {
		this.tech = tech;
	}

	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", courseName=" + courseName + "]";
	}
	
	public void display() {
		System.out.println(this.toString());
		System.out.println(this.tech.toString());
	}
	
	
}
