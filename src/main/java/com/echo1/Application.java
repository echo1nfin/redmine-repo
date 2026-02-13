package com.echo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // Минимальный контроллер для теста
    @RestController
    static class TestController {
        @GetMapping("/")
        public String hello() {
            return "Spring Boot is working!";
        }
    }
}
