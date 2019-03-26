package com.test.springboot.service;

import com.test.springboot.pojo.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();

    public int upDate(Student student);
}
