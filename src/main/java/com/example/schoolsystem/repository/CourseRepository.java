package com.example.schoolsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.schoolsystem.models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}