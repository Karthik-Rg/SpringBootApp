package com.ks.springboot.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepo courseRepo;
	
	private List<Course> courses = new ArrayList<>();
	
	public List<Course> getAllCourses() {
		 
		List<Course> courses = new ArrayList<>();
		courseRepo.findAll()
		.forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepo.findOne(id);
	}

	public void addCourse(Course courses) {
		courseRepo.save(courses);
	}

	public void updateCourse(String id, Course courses) {
		courseRepo.save(courses);
	}

	public void deleteCourse(String id) {
		courseRepo.deleteAll();
		}
		
}
