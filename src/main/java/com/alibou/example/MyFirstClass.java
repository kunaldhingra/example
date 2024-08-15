package com.alibou.example;


public class MyFirstClass {

    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String hello(){

        return "Hello from my bean class ==> myVar value = " + myVar;
    }
}
