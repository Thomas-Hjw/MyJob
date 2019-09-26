package com.stu.frame.myspringboot.dao;


import com.stu.frame.myspringboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    /**
     * 验证的登陆
     * @param name
     * @return
     */
    User selByName(String name);

    /**
     * 查询用户信息
     */
    List<User> selectSql(User user);

    /**
     * 添加用户
     */
    User insertUser(User user);
}
