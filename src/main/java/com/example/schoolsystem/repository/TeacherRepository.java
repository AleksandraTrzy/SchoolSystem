package com.example.schoolsystem.repository;
import java.util.List;

import com.example.schoolsystem.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>
{
    @Query(value="select s.id, s.stname, c.coursename from teacher t Inner JOIN course c ON s.course=c.id", nativeQuery=true)
    List<Object[]> findTeacher();
}