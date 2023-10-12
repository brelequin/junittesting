package com.example.junittesting.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.junittesting.models.Student;
import com.example.junittesting.services.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> findAllStudents(){
		
		return studentRepository.findAll(); 
		
	}
	
	public List<Student> findStudentsByCity(String city){
	
		return studentRepository.findAll().stream().filter(s -> s.getCity().equals(city)).collect(Collectors.toList());
	}
	public Student createStudent(Student student) {
		
		return studentRepository.save(student);
	}

}
