package com.github.levis9527.userweb.service.fallback;

import com.github.levis9527.userweb.service.UserWebService;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class UserWebServiceFallback implements UserWebService {
    @Override
    public List<String> remoteGetUserList() {
        return Collections.emptyList();
    }
}
