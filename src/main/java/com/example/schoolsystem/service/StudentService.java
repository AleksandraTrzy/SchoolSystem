package com.example.schoolsystem.service;


import com.example.schoolsystem.model.Student;

import java.util.List;
public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);

    List<Student> studentListAll(String keyword);
}