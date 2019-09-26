package com.stu.frame.myspringboot.service;

import com.stu.frame.myspringboot.dao.UserMapper;
import com.stu.frame.myspringboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 验证登录
     * @param name
     * @return
     */
    public User selByName(String name){
        return userMapper.selByName(name);
    }

    /**
     * 查询用户信息
     */
    public List<User> selectSql(User user){
        return userMapper.selectSql(user);
    }

    /**
     * 注册用户
     * @param user
     * @return
     */

    public void insertUser(User user) {
       userMapper.insertUser(user);
    }
}
