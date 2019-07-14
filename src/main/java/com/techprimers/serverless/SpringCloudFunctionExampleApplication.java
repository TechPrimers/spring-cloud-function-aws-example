package com.techprimers.serverless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringCloudFunctionExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFunctionExampleApplication.class, args);
    }

    @Bean
    public Function<String, String> function() {
        return input -> input;
    }

    @Bean
    public Consumer<String> consume() {
        return input -> System.out.println("Input: " + input);
    }

    @Bean
    public Supplier<String> supply() {
        return () -> "Hello Youtube";
    }

}
