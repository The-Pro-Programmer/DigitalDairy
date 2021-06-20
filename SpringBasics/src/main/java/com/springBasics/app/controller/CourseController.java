package com.springBasics.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {
	
	@RequestMapping("/coursesText")
	@ResponseBody
	public String coursesText() {
		System.out.println("Welcome to Course Controller!!");
		return "course.jsp";
	}
	
	@RequestMapping("course")
	public String course() {
		System.out.println("Welcome to Course Controller 2!!");
		return "course";
	}

}
