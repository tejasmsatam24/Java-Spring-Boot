package io.javabrains.springbootstarter.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

@Autowired
private CourseService courseService;

@RequestMapping("/courses")
 public List<Courses> getAllCourses() {
	 return courseService.getAllCourses();
 }

//get APIs
//@RequestMapping("/courses/{id}")
//public Courses getTheCourse(@PathVariable("id") String id) {
//return courseService.getTheTopic(id);
//	
//}

//post API's 
@RequestMapping(method=RequestMethod.POST, value = "/course")
public void addPost(@RequestBody Courses topic) {
	courseService.addCourse(topic);
	}

//put API(Update the stuff
@RequestMapping(method=RequestMethod.PUT, value = "/course/{id}")
public void updatePost(@RequestBody Courses topic, @PathVariable("id") String id){
	courseService.updateCourse(id, topic);
}


}

