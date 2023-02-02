package com.example.schoolsystem.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String teachername;
    private String course;
    private String email;
    public Teacher() {
        super();
    }
    public Teacher(Long id, String teachername, String course, String email) {
        super();
        this.id=id;
        this.teachername=teachername;
        this.course=course;
        this.email=email;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getTeachername(){
        return teachername;
    }
    public void setTeachername(String teachername){
        this.teachername=teachername;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
