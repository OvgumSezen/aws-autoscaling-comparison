package com.autoscaling_comparison.ms_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ms2")
public class MS2Controller {
    @GetMapping
    public List<String> getMS2() {
        return List.of("MS2_response1", "MS2_response2", "MS2_response3");
    }
}
