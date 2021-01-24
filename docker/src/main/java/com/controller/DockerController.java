package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/docker")
public class DockerController {
    @GetMapping("/say")
    public void say() {
        System.out.println("Hello docker!");
    }
}
