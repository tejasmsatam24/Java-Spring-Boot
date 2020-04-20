package io.javabrains.springbootstarter.courses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
	
	@Id
	String id;
	String courseName;
	String courseDescription;
	
	public Courses() {
		
	}
	
	public Courses(String id, String courseName, String courseDescription ) {
		this.id = id;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
	}
	
	//implementing the getters and setters 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	

	
	

}
