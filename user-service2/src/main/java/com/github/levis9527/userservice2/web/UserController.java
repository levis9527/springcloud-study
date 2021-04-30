package com.github.levis9527.userservice2.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("list")
    public List<String> listUser() {
        ArrayList<String> userList = new ArrayList<>();
        userList.add("张三-service2");
        userList.add("李四-service2");
        int t = 1/new Random().nextInt(3);
        return userList;
    }
}
