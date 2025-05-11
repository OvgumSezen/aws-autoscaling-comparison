package com.autoscaling_comparison.ms_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ms1")
public class MS1Controller {
    @GetMapping
    public List<String> getMS1() {
        return List.of("MS1_response1", "MS1_response2", "MS1_response3");
    }
}
