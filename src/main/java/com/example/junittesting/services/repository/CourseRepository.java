package com.example.junittesting.services.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.junittesting.models.Course;

public interface CourseRepository extends MongoRepository<Course, Integer>{

}
