package com.example.junittesting.models;

import java.util.List;

public class Course {
	
	private int id;
	private String title;
	private String subject;
	private List<Student> students;
	
	public Course(int id, String title, String subject, List<Student> students) {
		super();
		this.id = id;
		this.title = title;
		this.subject = subject;
		this.students = students;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", subject=" + subject + ", students=" + students + "]";
	}
	
	
	

}
