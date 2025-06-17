package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DemoController {

    @GetMapping("/api/status")
    public String getStatus() {
        log.info("Status endpoint called");
        return "Application is running successfully! CI/CD pipeline demo working.";
    }
}