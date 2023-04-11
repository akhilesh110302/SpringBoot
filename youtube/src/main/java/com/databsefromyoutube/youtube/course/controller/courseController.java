package com.databsefromyoutube.youtube.course.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.databsefromyoutube.youtube.course.beans.Course;
import com.databsefromyoutube.youtube.course.repository.CourseReposetory;


@RestController
public class courseController 
{
	@Autowired
	private CourseReposetory cr;
	
//	@GetMapping("/courses")
//	public List<Course> getAllCourses()
//	{
//		return Arrays.asList(new Course (1,"Learn Microservices","CodewithAkki"),
//				new Course (2,"Learn DS","CodewithAkhilesh"));
//	}	
	
	@GetMapping("/courses")
	public List<Course> getAllaCourses()
	{
		
	 return cr.findAll();
	}	
	
	@GetMapping("/courses/{id}")
	public Course getCoursesDetail(@PathVariable long id)
	{
		Optional<Course> course=cr.findById(id);
		if(course.isEmpty())
		{
			throw new RuntimeException("Couse not found with id"+id);
		}
	 return course.get();
	}	
	@PostMapping("/courses")
	public void createCourses(@RequestBody Course course)
	{
		
		cr.save(course);
	}	
	
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		cr.save(course);
	}	
		
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {
		cr.deleteById(id);
	}
}
