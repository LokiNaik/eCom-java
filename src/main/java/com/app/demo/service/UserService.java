package com.app.demo.service;

import com.app.demo.model.User;
import com.app.demo.repo.Repo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The UserService class.
 *
 * @author Loki
 */
@Service
public class UserService {

    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    private final Repo repo;

    @Autowired
    UserService(Repo repo) {
        this.repo = repo;
    }

    /**
     * @param user The User Object.
     * @return The User
     */
    public User addUser(final User user, final String correlationId) {
        String id = idGenerator();
        logger.info("Inside addUserService : {}", correlationId);
        user.setId(id);
        user.getAddress().setUserId(id);

        return repo.save(user);
    }

    private String idGenerator() {
        long timeStamp = System.currentTimeMillis();
        Date date = new Date(timeStamp);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(date);
    }
}
