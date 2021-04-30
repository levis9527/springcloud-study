package com.github.levis9527.userservice1.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("list")
    public List<String> listUser() {
        ArrayList<String> userList = new ArrayList<>();
        userList.add("张三-service1");
        userList.add("李四-service1");
        return userList;
    }
}
