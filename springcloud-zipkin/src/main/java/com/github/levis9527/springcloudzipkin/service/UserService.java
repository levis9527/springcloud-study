package com.github.levis9527.springcloudzipkin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@FeignClient("USER-SERVICE")
@FeignClient("USER-WEB")
public interface UserService {

//    @RequestMapping("user/list")
    @RequestMapping("user-web/list")
    public List<String> listUser();
}
