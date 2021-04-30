package com.github.levis9527.userweb.web;


import com.github.levis9527.userweb.service.UserWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user-web")
public class UserWebController {

    @Resource
    private UserWebService userWebService;



    @RequestMapping("list")
    public List<String> list() {
        return userWebService.remoteGetUserList();
    }


}
