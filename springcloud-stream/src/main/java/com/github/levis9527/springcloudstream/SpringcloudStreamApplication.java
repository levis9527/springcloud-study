package com.github.levis9527.springcloudstream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.PollableBean;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;

@SpringBootApplication
@RestController
public class SpringcloudStreamApplication {
    @Autowired
    private StreamBridge streamBridge;

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStreamApplication.class, args);
    }

//    @PollableBean
//    public Supplier<Flux<String>> stringSupplier() {
//        // 配合PollableBean注解
//        // 一个集合，循环推送
//        return () -> Flux.just("hello", "bye");
//    }

    @RequestMapping("pub")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void pub() {
        streamBridge.send("topic", "hello");
    }
}
