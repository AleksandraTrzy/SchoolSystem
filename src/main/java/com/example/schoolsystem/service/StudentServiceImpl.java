package com.example.schoolsystem.service;
import com.example.schoolsystem.model.Student;
import com.example.schoolsystem.model.Teacher;
import com.example.schoolsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService{
    @Autowired

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }
    public List<Student> studentListAll(String keyword){
        if (keyword!=null) {
            return studentRepository.search(keyword);
        }
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {

        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {

        studentRepository.deleteById(id);
    }


}
