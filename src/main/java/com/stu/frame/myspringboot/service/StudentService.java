package com.stu.frame.myspringboot.service;

import com.stu.frame.myspringboot.dao.StudentMapper;
import com.stu.frame.myspringboot.model.Student;
import com.stu.frame.myspringboot.model.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public List<Student> selectByExample(StudentExample studentExample){
        return studentMapper.selectByExample(studentExample);
    }

}
