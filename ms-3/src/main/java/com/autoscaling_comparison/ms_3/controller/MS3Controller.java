package com.autoscaling_comparison.ms_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ms3")
public class MS3Controller {
    @GetMapping
    public List<String> getMS3() {
        return List.of("MS3_response1", "MS3_response2", "MS3_response3");
    }
}
