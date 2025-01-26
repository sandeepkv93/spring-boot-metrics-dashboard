package com.example.demo.controller;

import com.example.demo.model.HealthStatus;
import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/custom-health")
    @Timed(value = "health.check", description = "Time taken to check health")
    public HealthStatus checkHealth() {
        return HealthStatus.builder()
                .status("UP")
                .message("Application is running normally")
                .build();
    }
}
