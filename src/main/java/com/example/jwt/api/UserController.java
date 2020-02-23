package com.example.jwt.api;

import com.example.jwt.model.User;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/user")
public class UserController {

    @GetMapping("/info")
    public User getUser(UsernamePasswordAuthenticationToken authentication) {
        return (User) authentication.getPrincipal();
    }
}
