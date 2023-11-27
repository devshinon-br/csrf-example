package com.iftm.csrf.prevention.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApiController {
    @GetMapping("/public/test")
    public String getTestPage() {
        return "test";
    }

    @PostMapping("/api/test")
    public String postTest() {
        return "success";
    }
}
