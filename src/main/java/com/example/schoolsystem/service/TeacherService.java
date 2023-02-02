package com.example.schoolsystem.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.schoolsystem.models.Teacher;
import com.example.schoolsystem.repository.TeacherRepository;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository repo;
    public List<Teacher> listAll()
    {
        System.out.println(repo.findAll());
        return repo.findAll();
    }


    public void save(Teacher td) {
        repo.save(td);
    }

    public Teacher get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

}
