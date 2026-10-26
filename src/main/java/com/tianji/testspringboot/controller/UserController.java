package com.tianji.testspringboot.controller;

import com.tianji.testspringboot.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserDAO userDAO;

    //当浏览器访问/user时，执行这个方法
    @GetMapping("/user")
    public List<Map<String,Object>> getUsers(){
        //调用Mapper查询数据库并返回
        return userDAO.findAll();
    }
}
