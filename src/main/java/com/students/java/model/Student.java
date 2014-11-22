package com.students.java.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by seanlivingston on 11/22/14.
 */
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
