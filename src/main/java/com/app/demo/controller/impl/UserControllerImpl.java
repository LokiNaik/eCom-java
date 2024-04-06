package com.app.demo.controller.impl;

import com.app.demo.service.UserService;
import com.app.demo.controller.UserController;
import com.app.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The UserControllerImp class.
 */
@RestController
public class UserControllerImpl implements UserController {

    UserService userService;

    private final Logger logger = LoggerFactory.getLogger(UserControllerImpl.class);

    @Autowired
    public UserControllerImpl(final UserService userService) {
        this.userService = userService;
    }

    /**
     * @param user The User Object.
     * @return The User.
     */
    @Override
    public User createUser(final User user, final String correlationId) {
        logger.info("Inside create user method  : {} ", correlationId);
        return userService.addUser(user, correlationId);
    }

    /**
     * @param correlation_id correlationId.
     * @return List of Users.
     */
    @Override
    public List<User> getAllUsers(final String correlation_id) {
        return userService.fetchAllUsers(correlation_id);
    }


    /**
     * @return The Application health.
     */
    @Override
    public String health() {
        return "Application up!";
    }

}
