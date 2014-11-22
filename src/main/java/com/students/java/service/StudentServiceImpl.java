package com.students.java.service;

import com.students.java.dao.StudentDao;
import com.students.java.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by seanlivingston on 11/22/14.
 */
@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }

    public List<Student> findAllStudents() {
        return studentDao.findAllStudents();
    }

    public void deleteStudentById(Integer id) {
        studentDao.deleteStudentById(id);
    }
}
