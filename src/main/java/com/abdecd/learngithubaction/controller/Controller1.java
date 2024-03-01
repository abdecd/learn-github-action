package com.abdecd.learngithubaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
    @GetMapping("")
    public String hello() {
        return "Hello World";
    }
}
