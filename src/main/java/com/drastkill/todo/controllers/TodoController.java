package com.drastkill.todo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    
    @RequestMapping("/")
    public String getTodos() {
        return "Hello World";
    }
}
