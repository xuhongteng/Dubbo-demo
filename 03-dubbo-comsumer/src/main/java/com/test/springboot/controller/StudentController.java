package com.test.springboot.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.test.springboot.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Reference(version = "1.0.0")
    private StudentService studentService;
    @RequestMapping("/boot/students")
    public Object getStudents(){
        return studentService.getAllStudent();
    }
}
