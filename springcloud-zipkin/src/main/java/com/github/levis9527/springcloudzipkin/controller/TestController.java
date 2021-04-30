package com.github.levis9527.springcloudzipkin.controller;

import com.github.levis9527.springcloudzipkin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("zipkin")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("listUser")
    public List<String> listUser() {
        return userService.listUser();
    }
}
