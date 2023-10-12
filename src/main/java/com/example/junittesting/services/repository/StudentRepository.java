package com.example.junittesting.services.repository;

import com.example.junittesting.models.Student;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer>{
	


}
