package com.example.demo1;

import org.springframework.context.annotation.Primary;

@Primary
public class Math implements Subject{
    @Override
    public void code(){
        System.out.println("MI1111");
    }
    public String subjectName = "Math";
}
