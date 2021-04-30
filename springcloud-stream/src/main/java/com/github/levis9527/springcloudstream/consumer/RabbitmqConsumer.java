package com.github.levis9527.springcloudstream.consumer;

import com.github.levis9527.springcloudstream.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Component
public class RabbitmqConsumer {

    @Bean
    public Consumer<Person> log() {
        return person -> {
            System.out.println("person = " + person);
        };
    }

//    @Bean
//    public Function<String, String> uppercase() {
//        return value -> value.toUpperCase();
//    }

//    @Bean
//    public Supplier<String> stringSupplier() {
//        System.out.println(123);
//        return () -> {
//            System.out.println(123444444);
//            return "Hello from Supplier" + new Random().nextInt(100);
//        };
//    }
}
