package com.example.schoolsystem.repository;
import com.example.schoolsystem.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
    @Query("SELECT teacher FROM Teacher teacher WHERE teacher.name LIKE %?1%")
    List<Teacher> search(String keyword);


}