package com.github.levis9527.springcloudfunction;

import org.apache.logging.log4j.util.Strings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringcloudFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFunctionApplication.class, args);
    }

    @Bean
    public Function<String, String> uppercase() {
        return value -> value.toUpperCase(Locale.ROOT);
    }

    @Bean
    public Function<String, String> reverse() {
        return value -> new StringBuilder(value).reverse().toString();
    }

    @Bean
    public Function<String, Integer> len() {
        return String::length;
    }

    @Bean
    public Supplier<String> testSupplier() {
        return () -> "hello";
    }

    @Bean
    public Supplier<Flux<String>> testFlux() {
        return () -> Flux.fromArray(new String[]{"1", "2", "3"});
    }

//    @PollableSupplier(splittable = true)
    @Bean
    public Supplier<Flux<String>> someSupplier() {
        return () -> {
            String v1 = String.valueOf(System.nanoTime());
            String v2 = String.valueOf(System.nanoTime());
            String v3 = String.valueOf(System.nanoTime());
            return Flux.just(v1, v2, v3);
        };
    }
}
