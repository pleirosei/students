package com.students.java.controllers;

import com.students.java.model.Student;
import com.students.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by seanlivingston on 11/22/14.
 */
@Controller
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentService studentService;

    /*
    This will list the students
     */
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> listStudents() {
        List<Student> students = studentService.findAllStudents();
        return students;
    }
}
