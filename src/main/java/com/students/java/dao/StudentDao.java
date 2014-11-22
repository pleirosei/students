package com.students.java.dao;

import com.students.java.model.Student;

import java.util.List;

/**
 * Created by seanlivingston on 11/22/14.
 */

public interface StudentDao {
    void saveStudent(Student student);

    List<Student> findAllStudents();

    void deleteStudentById(Integer id);
}
