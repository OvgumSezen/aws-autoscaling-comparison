package com.autoscaling_comparison.ms_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ms2")
public class MS2Controller {
    long min = 1000000;
    long max = 10000000;
    long range = max - min + 1;

    @GetMapping
    public List<String> getMS2() {
        simulateLoad();
        return List.of("MS2_response1", "MS2_response2", "MS2_response3");
    }

    private void simulateLoad() {
        long sum = 0;
        long randomLoad = (long) (Math.random() * range) + min;
        for (int i = 0; i < randomLoad; i++) {
            sum += i;
        }
    }
}
