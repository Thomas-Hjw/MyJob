package com.stu.frame.myspringboot.dao;

import com.stu.frame.myspringboot.common.BaseModelExample;
import com.stu.frame.myspringboot.model.MySchool;
import com.stu.frame.myspringboot.model.School;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MySchoolMapper {

    List<MySchool> selSchool(BaseModelExample baseModelExample);

    List<MySchool> getSql(MySchool mySchool);
    int updateSchool(MySchool schoolupdate);

    MySchool loadById(int id);

    int deleteId(int id);
}
