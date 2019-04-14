package dev.a2.billboard.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorld {

    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }

    public String getMessage() {
        return "Hello World! works";
    }
}
