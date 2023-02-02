package com.example.schoolsystem.service;

import com.example.schoolsystem.model.Teacher;
import com.example.schoolsystem.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository repo;
    public List<Teacher> listAll() {
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
