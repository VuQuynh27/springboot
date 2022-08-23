package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student1 implements Student {
    @Override
    public void status(){
        System.out.println("undergraduate");
    }

    public Subject subject;

    @Autowired
    public Student1(Subject subject){
        this.subject = subject;
    }

    public void study(){
    }
    @Autowired
    public void study(Subject subject){
        this.subject = new Math();
    }
}
