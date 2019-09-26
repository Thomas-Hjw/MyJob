package com.stu.frame.myspringboot.controller;

import com.stu.frame.myspringboot.model.User;
import com.stu.frame.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/into")
    public String intoUser(){

        return "into";
    }

    /**
     * 查询用户信息
     * @return
     */
    @RequestMapping("/selectSql")
    @ResponseBody
    public List<User> selectSql(){
        User user = new User();
        user.setId(1);
        user.setName("tom");
        return userService.selectSql(user);
    }

    /**
     * 注册用户信息
     *
     * 可以向数据库插入数据 但是会出现错误信息
     */
    @RequestMapping("/insertUser")
    @ResponseBody
    public  void insertUser(){
        User user = new User();
        user.setId(3);
        user.setName("Joke");
        user.setPassword("456");
        userService.insertUser(user);
    }
}
