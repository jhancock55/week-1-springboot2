package com.john3.socialMediaApi2.repository;

import org.springframework.data.repository.CrudRepository;

import com.john3.socialMediaApi2.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{
	public User findByUsername(String username);

}
