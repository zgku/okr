package com.org.fun.controller;


import com.org.fun.entity.User;
import com.org.fun.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zgku
 * @since 2020-12-05
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findUsers")
    public List<User> findUsers(){
        List<User> list =userService.list();
        return list;
    }

}

