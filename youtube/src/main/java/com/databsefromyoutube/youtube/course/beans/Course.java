package com.databsefromyoutube.youtube.course.beans;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private long id;
//	@Column(name="Course_name")
	private String name;
	private String Author;
	public Course()
	{
		
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public String getAuthor() {
		return Author;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", Author=" + Author + "]";
	}
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		Author = author;
	}
	
}
