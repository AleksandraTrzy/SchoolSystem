package com.example.schoolsystem.controller;
import com.example.schoolsystem.model.Teacher;
import com.example.schoolsystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;
import java.util.List;

public class TeacherController {
    @Autowired
    private TeacherService service;
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Teacher> listteacher = service.listAll();
        model.addAttribute("listteacher", listteacher);
        System.out.println("Get / ");
        return "index";
    }
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("teacher", new Teacher());
        return "new";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveTeacher(@ModelAttribute("teacher") Teacher td) {
        return "redirect:/";
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditTeacherPage(@PathVariable(name="id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Teacher td = service.get(id);
        mav.addObject("teacher", td);
        return mav;
    }
    @RequestMapping("/delete/{id}")
    public String deleteteacher(@PathVariable(name="id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
