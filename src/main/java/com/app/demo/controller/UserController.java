package com.app.demo.controller;

import com.app.demo.constants.ApplicationConstants;
import com.app.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RequestMapping(ApplicationConstants.Paths.BASE_PATH)
public interface UserController {
    @PostMapping("/createUsers")
    User createUser(@RequestBody User user, @RequestHeader(value = ApplicationConstants.Headers.CORRELATION_ID) String correlationId);

    @GetMapping("/health")
    String health();

}
