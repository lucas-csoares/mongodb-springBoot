package com.lucassoares.mongodbspringboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucassoares.mongodbspringboot.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
}
