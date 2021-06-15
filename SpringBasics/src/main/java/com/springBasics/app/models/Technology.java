package com.springBasics.app.models;

import org.springframework.stereotype.Component;

@Component
public class Technology {
	
	private String techId;
	private String techName;
	
	
	public String getTechId() {
		return techId;
	}
	public void setTechId(String techId) {
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	
	@Override
	public String toString() {
		return "Technology [techId=" + techId + ", techName=" + techName + "]";
	}
	
	public void display() {
		System.out.println(this.toString());
	}
	

}
