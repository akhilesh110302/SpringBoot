package com.newprojectusingspringboot.springbootwithakhilesh.course.beans;

public class Course {

	private long id;
	private String name;
	private String Author;
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
