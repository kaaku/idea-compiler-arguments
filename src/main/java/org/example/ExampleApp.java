package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApp {

    public static void main(String[] args) {
        new SpringApplication(ExampleApp.class).run(args);
    }
}
