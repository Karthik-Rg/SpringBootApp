package com.ks.springboot.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@RequestMapping(method = RequestMethod.GET, value ="/topics")
	public List<Course> getAllTopics() {
		return courseService.getAllCourses();
	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/topics/{id}")
	public Course getTopicId(@RequestParam(value = "id") String id) {
		return courseService.getCourse(id);
	}

	  @RequestMapping(method=RequestMethod.POST, value="/topics") 
	  public void addTopic(@RequestBody Course courses) {
		  courseService.addCourse(courses);;
	}
	  
	  @RequestMapping(method = RequestMethod.PUT, value ="/topics/{id}")
		public void updateTopic(@RequestBody Course courses, @RequestParam(value = "id") String id) {
		 courseService.updateCourse(id, courses);
		}
	  
	  @RequestMapping(method = RequestMethod.DELETE, value ="/topics/{id}")
	  public void deleteTopic(@RequestParam(value = "id") String id) {
		 courseService.deleteCourse(id);;
	  }
		
	 
	
}
