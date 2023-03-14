package com.example.schoolsystem.repository;
import com.example.schoolsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    @Query("SELECT student FROM Student student WHERE student.name LIKE %?1%")
    List<Student> search(String keyword);


}