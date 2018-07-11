package com.example.demo.controller;

import com.example.demo.models.Major;
import com.example.demo.models.Student;
import com.example.demo.repository.AppRoleRepository;
import com.example.demo.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


    @Autowired
    private AppUserRepository users;

    @Autowired
    private AppRoleRepository roles;



    @RequestMapping ("/")
    public String showHome () {
        return "index";
    }

    @RequestMapping("/adduser")
    public String addUser (){
        return "register";
    }

    @RequestMapping("/allcourses")
    public String showAllCourses (){
        return "allcourses";
    }

    @RequestMapping("/currentsemester")
    public String showCurrentCourses (){
        return "currentsemester";
    }
}