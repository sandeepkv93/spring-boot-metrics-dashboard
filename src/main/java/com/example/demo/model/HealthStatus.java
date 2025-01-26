package com.example.demo.model;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class HealthStatus {
    private String status;
    private String message;
}
