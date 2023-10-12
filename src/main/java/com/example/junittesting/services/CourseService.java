package com.example.junittesting.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.junittesting.models.Course;
import com.example.junittesting.models.Student;
import com.example.junittesting.services.repository.CourseRepository;

public class CourseService {

	@Autowired
	CourseRepository courseRepository;
	
	public List<Course> filterCoursesByStudentCity(List<Course> courses, String city){
		//Repository.findAll()
		return courses.stream()
				.filter(c -> c.getStudents().stream().anyMatch(s -> s.getCity().equals(city)))
				.collect(Collectors.toList());
	}
	
	public List<Course> filterCoursesBySubject(List<Course> list, String subject){
		return list.stream()
				.filter(c -> c.getSubject().equals(subject))
				.collect(Collectors.toList());
	}
	
	public List<Course> filterCoursesByAmountOfStudents(List<Course> list, int amount){
		return list.stream()
				.filter(c -> c.getStudents().size() >= amount)
				.collect(Collectors.toList());
	}

}
