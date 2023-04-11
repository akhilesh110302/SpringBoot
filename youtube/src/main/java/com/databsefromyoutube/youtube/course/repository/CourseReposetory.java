package com.databsefromyoutube.youtube.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.databsefromyoutube.youtube.course.beans.Course;

public interface CourseReposetory extends JpaRepository< Course,Long > {

}
