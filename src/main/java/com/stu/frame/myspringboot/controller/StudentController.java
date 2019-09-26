package com.stu.frame.myspringboot.controller;

import com.stu.frame.myspringboot.model.Student;
import com.stu.frame.myspringboot.model.StudentExample;
import com.stu.frame.myspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/example")
    @ResponseBody
    public List<Student> example(){
        StudentExample studentExample = new StudentExample();
        studentExample.setOrderByClause("id desc");
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andSexEqualTo("男");
        return studentService.selectByExample(studentExample);
    }
}
