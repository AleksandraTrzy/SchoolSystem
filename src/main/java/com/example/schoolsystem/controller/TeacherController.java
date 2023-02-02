package com.example.schoolsystem.controller;
import java.util.List;

import com.example.schoolsystem.models.Course;
import com.example.schoolsystem.models.Teacher;
import com.example.schoolsystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.schoolsystem.service.CourseService;

@Controller
@RequestMapping("/Teacher")

public class TeacherController {
    @Autowired
    private TeacherService service;
    @Autowired
    private CourseService services;

    @GetMapping("/addteacher")
    public String add(Model model) {
        List<Teacher> listteacher = service.listAll();
        List<Course> listcourse = services.listAll();
        model.addAttribute("listcourse", listcourse);
        model.addAttribute("listteacher", listteacher);
        model.addAttribute("teacher", new Teacher());
        return "addteacher";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveTeacher(@ModelAttribute("teacher") Teacher td)
    {
        service.save(td);
        return "redirect:/teacher";
    }


    @RequestMapping("/edit/{id}")
    public ModelAndView showEditTeacherPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("addteacher");
        List<Course> listcourse = services.listAll();
        Teacher td = service.get(id);
        mav.addObject("teacher", td);
        return mav;

    }
    @RequestMapping("/delete/{id}")
    public String deleteTeacherPage(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "teacher";
    }

}