package com.autoscaling_comparison.ms_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ms3")
public class MS3Controller {
    long min = 1000000;
    long max = 10000000;
    long range = max - min + 1;

    @GetMapping
    public List<String> getMS3() {
        simulateLoad();
        return List.of("MS3_response1", "MS3_response2", "MS3_response3");
    }

    private void simulateLoad() {
        long sum = 0;
        long randomLoad = (long) (Math.random() * range) + min;
        for (int i = 0; i < randomLoad; i++) {
            sum += i;
        }
    }
}
