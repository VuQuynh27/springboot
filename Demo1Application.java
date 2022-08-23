package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {
    public static void main(String[] args) {
        //SpringApplication.run(Demo1Application.class, args);
        ApplicationContext context = SpringApplication.run(Demo1Application.class, args);
        Student1 student1 = context.getBean(Student1.class);
        student1.status();
        student1.study();
    }
}
