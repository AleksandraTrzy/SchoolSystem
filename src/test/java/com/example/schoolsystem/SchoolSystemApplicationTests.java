/** package com.example.schoolsystem;

import com.example.schoolsystem.model.Teacher;
import com.example.schoolsystem.repository.TeacherRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
class SchoolSystemApplicationTests {
    @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
    @Rollback(false)
    public static class ProductRepositoryTest {
        @Autowired
        TeacherRepository teacherRepository;
        @Test
       public void testSaveTeacher() {
            Teacher teacher = new Teacher();
            teacher.setName("Lucy");
            teacher.setCourse("Physics");
            teacher.setEmail("lucyphysics@gmail.com");
        }

}}*/
