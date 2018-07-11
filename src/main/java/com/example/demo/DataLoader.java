//package com.example.demo;
//
//import com.example.demo.models.*;
//import com.example.demo.repository.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//
//    @Autowired
//    AppUserRepository userRepository;
//
//    @Autowired
//    AppRoleRepository roleRepository;
//
//    @Autowired
//    ClassroomRepository classrooms;
//
//    @Autowired
//    DepartmentRepository departments;
//
//    @Autowired
//    InstructorRepository instructors;
//
//    @Autowired
//    MajorRepository majors;
//
//    @Autowired
//    OurClassRepository classes;
//
//    @Autowired
//    CourseRepository courses;
//
//
//    @Override
//    public void run(String... strings)  strings{
//
//        Classroom classroom = new Classroom();
//        classroom.setBuildingName("Humanities");
//        classroom.setMaxCapacity(20);
//        classroom.setRoomNumber(321);
//        OurClass ourClass = new OurClass();
//        classroom.addClass(ourClass);
//        classrooms.save(classroom);
//
//
//        Department department = new Department();
//        department.setDeptName("English");
//        Instructor instructor = new Instructor();
//        department.addInstructor(instructor);
//        Course course = new Course();
//        department.addCourse(course);
//        Major major = new Major();
//        department.addMajor(major);
//        departments.save(department);
//
//        instructor.setEmployeeNumber(8675309);
//        instructor.setEmployeeName("Dave Wolf");
//        instructor.setDepartment (department);
//        instructor.setOfficeNumber("HU322");
//        instructors.save (instructor);
//
//        course.setCourseNumber(101);
//        course.setMajor(major);
//        course.setCourseName("Freshman Composition");
//        course.setNumberOfCredits(3);
//        course.setCourseDescription("First English Course");
//        courses.save(course);
//
//        ourClass.setCourseNumber("1010");
//        ourClass.setCrn("10072");
//        ourClass.setClassroom(classroom);
//        ourClass.setInstructor(instructor);
//        ourClass.setSubjectCode("BIO");
//        classes.save(ourClass);
//
//
//
//
//
//        /*Role aRole = new Role();
//        aRole.setRole("USER");
//        roleRepository.save(aRole);
//
//        aRole = new Role();
//        aRole.setRole("ADMIN");
//        roleRepository.save(aRole);
//
//        AppUser user = new AppUser();
//        user.setUsername("admin");
//        user.setPassword(passwordEncoder.encode("password"));
//        user.addRole(roleRepository.findByRole("ADMIN"));
//        userRepository.save(user);
//
//        user = new AppUser();
//        user.setUsername("user");
//        user.setPassword(passwordEncoder.encode("password"));
//        user.addRole(roleRepository.findByRole("USER"));
//        userRepository.save(user);*/
//    }
//
//}
