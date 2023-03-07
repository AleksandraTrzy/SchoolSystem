package com.example.schoolsystem;

import com.example.schoolsystem.model.Teacher;
import com.example.schoolsystem.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SchoolSystemApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(SchoolSystemApplication.class, args);
    }

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public void run(String... args) throws Exception {

    }


}
