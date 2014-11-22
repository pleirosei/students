package com.students.java.dao;

import com.students.java.model.Student;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by seanlivingston on 11/22/14.
 */
@Repository("studentDao")
public class StudentDaoImpl extends AbstractDao implements StudentDao {

    public void saveStudent(Student student) {
        persist(student);
    }

    @SuppressWarnings("unchecked")
    public List<Student> findAllStudents() {
        Criteria criteria = getSession().createCriteria(Student.class);
        return (List<Student>) criteria.list();
    }

    public void deleteStudentById(Integer id) {
        Query query = getSession().createSQLQuery("DELETE FROM students WHERE id = :id");
        query.setInteger("id", id);
        query.executeUpdate();
    }
}
