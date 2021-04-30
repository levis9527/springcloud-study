package com.github.levis9527.userweb.service;

import com.github.levis9527.userweb.service.fallback.UserWebServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "user-service", fallback = UserWebServiceFallback.class)
public interface UserWebService {

    @RequestMapping("/user/list")
    List<String> remoteGetUserList();
}
