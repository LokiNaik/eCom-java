package com.app.demo.controller;

import com.app.demo.constants.ApplicationConstants;
import com.app.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(ApplicationConstants.Paths.BASE_PATH)
public interface UserController {
    @PostMapping("/createUsers")
    User createUser(@RequestBody User user, @RequestHeader(value = ApplicationConstants.Headers.CORRELATION_ID) final String correlationId);

    @GetMapping(value = "/getUsers")
    public List<User> getAllUsers(@RequestHeader(value = ApplicationConstants.Headers.CORRELATION_ID) final String correlationId);

    @GetMapping("/health")
    public String health();

}
