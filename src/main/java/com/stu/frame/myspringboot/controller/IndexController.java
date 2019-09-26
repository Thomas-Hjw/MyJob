package com.stu.frame.myspringboot.controller;

import com.stu.frame.myspringboot.common.BaseResult;
import com.stu.frame.myspringboot.model.User;
import com.stu.frame.myspringboot.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 登录页面、首页
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private static final Log logger = LogFactory.getLog(IndexController.class);
    @Autowired
    private UserService userService;

    /**
     * 登录页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = {"", "/login.html"})
    public String toLogin(Model model) {

        return "login";

    }

    /**
     * 登录接口
     *
     * @param model
     * @param loginData JSON格式的登录信息，可以使用Java类描述，也可以使用Map
     * @return
     */

    @RequestMapping(value = {"login.json"})
    @ResponseBody
    public BaseResult login(Model model, @RequestBody Map<String, Object> loginData) {


        BaseResult baseResult = new BaseResult();

        String name = loginData.get("loginName").toString();
        String pwd = loginData.get("loginPwd").toString();


        User user = userService.selByName(name);


        if (user != null){
            if (user.getPassword().equals(pwd)){
                //登陆成功
                baseResult.setSuccess(true);
            }else{
                //登陆失败
                baseResult.setSuccess(false);
            }

        }

        return baseResult;
    }

    /**
     * 主页
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = {"index.html"})
    public String index(HttpServletRequest request,
                        HttpServletResponse response) {

        return "dashboard";
    }


//    @RequestMapping("/login.json")
//    @ResponseBody
//    public BaseResult getNewName(@RequestBody Map<String, Object> loginData) {
////        Map<String, Object> map = new HashMap<>();
////        String loginName = loginData.get("loginName").toString();
////        System.out.println("----------indexController----155");
//
//        BaseResult baseResult = new BaseResult();
//        Object loginName = loginData.get("loginName");
//        if (loginData != null)
//            baseResult.setSuccess(true);
//
//        return baseResult;
//    }

}