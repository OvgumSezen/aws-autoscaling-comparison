package com.autoscaling_comparison.ms_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ms1")
public class MS1Controller {
    long min = 10000;
    long max = 100000;
    long range = max - min + 1;

    @GetMapping
    public List<String> getMS1() {
        simulateLoad();
        return List.of("MS1_response1", "MS1_response2", "MS1_response3");
    }

    private void simulateLoad() {
        long sum = 0;
        long randomLoad = (long) (Math.random() * range) + min;
        for (int i = 0; i < randomLoad; i++) {
            sum += i;
        }
    }
}
