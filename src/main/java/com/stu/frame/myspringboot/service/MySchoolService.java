package com.stu.frame.myspringboot.service;

import com.stu.frame.myspringboot.common.BaseModelExample;
import com.stu.frame.myspringboot.dao.MySchoolMapper;
import com.stu.frame.myspringboot.dao.SchoolMapper;
import com.stu.frame.myspringboot.model.MySchool;
import com.stu.frame.myspringboot.model.School;
import com.stu.frame.myspringboot.model.SchoolExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MySchoolService {

    @Autowired
    MySchoolMapper mySchoolMapper;


    public List<MySchool> selSchool(BaseModelExample baseModelExample){

//        List<MySchool> list = mySchoolMapper.selSchool();
        return mySchoolMapper.selSchool(baseModelExample);
    }


    public List<MySchool> getSQL(MySchool mySchool) {
        return mySchoolMapper.getSql(mySchool);
    }
    public int updateSchool(MySchool schoolupdate) {
        return mySchoolMapper.updateSchool(schoolupdate);
    }

    public MySchool loadById(int id) {
        return mySchoolMapper.loadById(id);
    }

    public int deleteId(int id) {
        return mySchoolMapper.deleteId(id);
    }
}
