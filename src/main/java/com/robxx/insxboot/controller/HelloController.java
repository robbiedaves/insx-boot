package com.robxx.insxboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "insx-boot started. Welcome to the insurance boot prototype.";
    }
}
