package com.example.demo.controller;


import com.example.demo.models.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

@Controller
public class MainController {


//    @Autowired
//    private AppUserRepository users;
//
//    @Autowired
//    private AppRoleRepository roles;


    @Autowired
    ClassroomRepository classrooms;

    @Autowired
    DepartmentRepository departments;

    @Autowired
    InstructorRepository instructors;

    @Autowired
    MajorRepository majors;

    @Autowired
    OurClassRepository classes;

    @Autowired
    CourseRepository courses;



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


    @PostConstruct
    public void fillTables (){
        Classroom classroom = new Classroom();
        classroom.setBuildingName("Humanities");
        classroom.setMaxCapacity(20);
        classroom.setRoomNumber(321);
        OurClass ourClass = new OurClass();
        classrooms.save(classroom);


        Department department = new Department();
        department.setDeptName("English");
        Instructor instructor = new Instructor();
        Course course = new Course();
        Major major = new Major();
        departments.save(department);

        instructor.setEmployeeNumber(8675309);
        instructor.setEmployeeName("Dave Wolf");
        instructor.setOfficeNumber("HU322");
        instructors.save (instructor);

        course.setCourseNumber(101);
        course.setCourseName("Freshman Composition");
        course.setNumberOfCredits(3);
        course.setCourseDescription("First English Course");
        courses.save(course);

        ourClass.setCourseNumber("1010");
        ourClass.setCrn("10072");
        ourClass.setSubjectCode("BIO");
        classes.save(ourClass);

    }
}