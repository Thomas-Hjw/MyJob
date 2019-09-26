package com.stu.frame.myspringboot.controller;

import com.stu.frame.myspringboot.common.BaseModelExample;
import com.stu.frame.myspringboot.common.BaseResult;
import com.stu.frame.myspringboot.common.BootstrapTable;
import com.stu.frame.myspringboot.common.QueryParam;
import com.stu.frame.myspringboot.model.MySchool;
import com.stu.frame.myspringboot.model.School;
import com.stu.frame.myspringboot.model.SchoolExample;
import com.stu.frame.myspringboot.service.MySchoolService;
import com.stu.frame.myspringboot.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/school")
public class SchoolController {

    private int newHtmlID;

    @Autowired
    MySchoolService mySchoolService;

    @Autowired
    SchoolService schoolService;

    @RequestMapping({"/index", ""})
    public String getLogin(Model model) {
        return "school/index";
    }


    @RequestMapping("/getData")
    @ResponseBody
    public BootstrapTable getData(@RequestBody(required = false) final QueryParam queryParam) {
//        System.out.println("-----SchoolController queryParam + " + queryParam);

//        return null;
        int pageSize = queryParam.getLimit();
        int pageNumber = queryParam.getOffset();
//        System.out.println(pageSize+"-----"+pageNumber);
        BaseModelExample baseModelExample = new BaseModelExample();
        baseModelExample.setPageSize(pageSize);
        baseModelExample.setRowIndex(pageNumber);
        List<MySchool> list = mySchoolService.selSchool(baseModelExample);
//        System.out.println(".....ddd...." + list);
        return new BootstrapTable(1000, list);

    }

    @RequestMapping("/getSql")
    @ResponseBody
    public List<MySchool> getSql(){

        MySchool mySchool = new MySchool();
        mySchool.setId(1);
        mySchool.setName("北京大学");
        List<MySchool> mysql = mySchoolService.getSQL(mySchool);
        return mysql;
    }


    /**
     * 熟悉逆向工程中的StudentExample类中的方法，Exampl中定义的方法是Sql语句
     * 中Where后的条件查询
     * 有错误为找到selectByExample方法 已解决
     * 解决方法 重新使用逆向工程生成文件，因为之前逆向工程的文件我的是其他工厂拷贝的
     */
    @RequestMapping("/example")
    @ResponseBody
    public List<School> example(){
        SchoolExample schoolExample = new SchoolExample();
        schoolExample.setOrderByClause("id desc");
        SchoolExample.Criteria criteria = schoolExample.createCriteria();
        criteria.andLevelEqualTo("8星级");
        return schoolService.selectByExample(schoolExample);
    }

    /**
     * 编辑页面
     * @return
     */
    @RequestMapping("/{id}/new")
    public String newHtml(Model model,@PathVariable int id){

        MySchool mySchool = this.mySchoolService.loadById(id);
        model.addAttribute("school", mySchool);

        newHtmlID = id;
        return "/school/new";
    }

    /**
     * 编辑页面保存功能
     */
    @RequestMapping("/save.json")
    @ResponseBody
    public BaseResult save(@RequestBody MySchool schoolupdate){
//        System.out.println(newHtmlID);
        schoolupdate.setId(newHtmlID);
//        System.out.println("-------SchoolController---------102-------"+schoolupdate);
        int updateReturn = mySchoolService.updateSchool(schoolupdate);
//        System.out.println("updateReturn:"+updateReturn);
        BaseResult baseResult = new BaseResult();
        if(updateReturn > 0){
            baseResult.setSuccess(true);
        }else {
            baseResult.setSuccess(false);
        }
        System.out.println(baseResult);
        return baseResult;
    }

    /**
     * 删除功能
     */
    @RequestMapping("/delete.json")
    @ResponseBody
    public BaseResult delete(@RequestParam Integer id){
        System.out.println("-----SchoolController---128----"+id);

        int count = mySchoolService.deleteId(id);
        BaseResult baseResult = new BaseResult();
        baseResult.setSuccess(count > 0 ? true : false);
        return baseResult;

    }


}
