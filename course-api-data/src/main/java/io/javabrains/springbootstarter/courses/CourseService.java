package io.javabrains.springbootstarter.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	private List<Courses> topics= new ArrayList<>(Arrays.asList(
			 new Courses("001","Java","Basic Concepts of Java."),
			 new Courses("002","Java Spring", "Basic Concepts of Java Spring."),
			 new Courses("003","Java Spring Boot","Basic Concepts of Java Spring Boot.")
			 ));
	
	public List<Courses> getAllCourses(){
		
		List<Courses> topics = new ArrayList<>();
		courseRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
//	public <Topics> getTheTopic(String id) {
//		 topicRepository.findById(id);
//		
//	}
	
	public void addCourse(Courses topic) {
		courseRepository.save(topic);
	}
	
	public void updateCourse(String id, Courses topic) {
		courseRepository.save(topic);
			}
			
	public void deleteTopic(String id) {
		 courseRepository.deleteById(id);
	}

	}


