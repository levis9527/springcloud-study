package com.github.levis9527.springcloudfunction.function;

import com.sun.tracing.dtrace.FunctionName;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
// 默认function名字为bean的名字，也就是开头小写
public class Greeter implements Function<String, String> {

    @Override
    public String apply(String s) {
        return "Hello " + s + ", and welcome to Spring Cloud Function!!!";
    }
}
