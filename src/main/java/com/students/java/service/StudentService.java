package com.students.java.service;

import com.students.java.model.Student;

import java.util.List;

/**
 * Created by seanlivingston on 11/22/14.
 */
public interface StudentService {
    void saveStudent(Student student);

    List<Student> findAllStudents();

    void deleteStudentById(Integer id);
}
