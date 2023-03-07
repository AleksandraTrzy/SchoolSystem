package com.example.schoolsystem.service;
import com.example.schoolsystem.model.Teacher;

import java.util.List;
public interface TeacherService {
    List<Teacher> getAllTeachers();

    Teacher saveTeacher(Teacher teacher);

    Teacher getTeacherById(Long id);

    Teacher updateTeacher(Teacher teacher);

    void deleteTeacherById(Long id);

    List<Teacher> teacherListAll(String keyword);
}