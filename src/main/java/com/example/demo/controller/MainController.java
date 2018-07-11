package com.example.demo.controller;


import com.example.demo.models.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

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
    public String showCurrentCourses (Model model){
        model.addAttribute("courses", courses.findAll());
        model.addAttribute("instructors", instructors.findAll());
        model.addAttribute("classes", classes.findAll());
        return "currentsemester";
    }

    @RequestMapping("/enroll/{id}")
    public String addCourseInfo (@PathVariable("id") long id, RedirectAttributes model){
        model.addFlashAttribute("class",classes.findById(id).get());
        return "redirect:/student/enroll";
    }


    @PostConstruct
    public void fillTables (){
        Classroom classroom = new Classroom();
        classroom.setBuildingName("Humanities");
        classroom.setMaxCapacity(20);
        classroom.setRoomNumber(321);
        OurClass ourClass = new OurClass();
        classrooms.save(classroom);



        Instructor instructor = new Instructor();
        Course course = new Course();
        Major major = new Major();


        instructor.setEmployeeNumber(8675309);
        instructor.setEmployeeName("Dave Wolf");
        instructor.setOfficeNumber("HU322");


        course.setCourseNumber(101);
        course.setCourseName("Freshman Composition");
        course.setNumberOfCredits(3);
        course.setCourseDescription("First English Course");
        course.setSubjectCode("ENG");

        Department department = new Department();
        department.setDeptName("English");
        departments.save(department);
        instructor.setDepartment(department);
        instructors.save (instructor);

        course.setDepartment(department);
        major.setMajorName("English");
        major.setDepartment(department);
        majors.save(major);
        course.setMajor(major);
        courses.save(course);

        ourClass.setCourseNumber("1010");
        ourClass.setCrn("10072");
        ourClass.setSubjectCode("BIO");
        ourClass.setClassroom(classroom);
        ourClass.setInstructor(instructor);
        ourClass.setCourse(course);
        classes.save(ourClass);


    }
}