package com.renanazzolim.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.renanazzolim.helpdesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	User findByEmail(String email);

}
