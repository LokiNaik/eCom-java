package com.app.demo.repo;

import com.app.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repo extends MongoRepository<User,String> {
}
