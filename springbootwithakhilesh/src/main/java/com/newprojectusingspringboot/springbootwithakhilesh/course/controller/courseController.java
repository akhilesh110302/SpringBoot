package com.newprojectusingspringboot.springbootwithakhilesh.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newprojectusingspringboot.springbootwithakhilesh.course.beans.Course;

@RestController
public class courseController 
{
	@GetMapping("/courses")
	public List<Course> getAllCourses()
	{
		return Arrays.asList(new Course (1,"Learn Microservices","CodewithAkki"),
				new Course (2,"Learn DS","CodewithAkhilesh"));
	}	
	@GetMapping("/courses/1")
	public Course getcourse()
	{
		return new Course (1,"Learn Microservices","CodewithAkki");
	}
}
