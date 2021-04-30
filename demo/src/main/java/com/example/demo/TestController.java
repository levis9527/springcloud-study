package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Autowired
    private UserTest userTest;
    @Autowired
    private UserTestAuto userTestAuto;
    @Autowired
    private UserService userService;

    @Value("${user.name1}")
    private String name;

    @RequestMapping("testUser")
    public UserTest testUser() {
        System.out.println(name);
        return userTest;
    }

    @RequestMapping("testUserAuto")
    public UserTestAuto testUserAuto() {
        System.out.println(name);
        return userTestAuto;
    }

    @RequestMapping("testOtherUser")
    public UserTestAuto testOutherUser() {
        return userService.testOther();
    }

}
