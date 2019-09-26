package com.stu.frame.myspringboot.service;

import com.stu.frame.myspringboot.dao.SchoolMapper;
import com.stu.frame.myspringboot.model.MySchool;
import com.stu.frame.myspringboot.model.School;
import com.stu.frame.myspringboot.model.SchoolExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolMapper schoolMapper;


    public List<School> selectByExample(SchoolExample schoolExample) {
        return  schoolMapper.selectByExample(schoolExample);
    }

}
