package com.example.demo1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.example.demo1")
public interface Student {
    public void status();
}
