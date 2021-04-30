package com.github.levis9527.springcloudeureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEureka1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEureka1Application.class, args);
    }

}
