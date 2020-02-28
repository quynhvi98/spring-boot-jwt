package com.example.jwt.config;

import lombok.Data;

import java.util.List;

@Data
public class AuthObject {
    private String serviceId;
    private List<String> path;
    private String expression;

}