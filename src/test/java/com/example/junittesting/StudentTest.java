package com.example.junittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.junittesting.models.Student;
import com.example.junittesting.services.StudentService;
import com.example.junittesting.services.repository.StudentRepository;


public class StudentTest {
	
	
	List<Student> students;
	Student st;
	
	@Mock
	StudentRepository studentRepository;
	
	@InjectMocks
	StudentService studentService;	
	
	
	
	
	@BeforeEach
	public void init() {
		students = new ArrayList<>();
		students.add(new Student(1,"Brenda","Monterrey"));
		students.add(new Student(1,"Carlos","Monterrey"));
		students.add(new Student(1,"Bere","Apodaca"));
		students.add(new Student(1,"Pedro","San Nicolas"));
		students.add(new Student(1,"Luis","Monterrey"));
		
		MockitoAnnotations.initMocks(this);
		
		//cuando se manda a llamar el findallstudent se injecta los estudiante que inicializé
		when(studentService.findAllStudents()).thenReturn(students);
		
		st = new Student(4,"Juan","Monterrey" );
	}
	
	@Test
	public void findAllStudents() {
		
	
		
		assertEquals(5, studentService.findAllStudents().size());
		
	}
	
	
	@Test
	public void findStudentsByCity() {
		

		assertEquals(3, studentService.findStudentsByCity("Monterrey").size());

	
	
	}
	
	@Test
	public void createStudent() {
		
		when(studentService.createStudent(st)).thenReturn(st);
		
		assertEquals("Juan",studentService.createStudent(st).getName());
		
	}
		
	

}
