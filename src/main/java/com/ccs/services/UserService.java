package com.ccs.services;

import java.util.List;
import java.util.Optional;

import com.ccs.model.User;


public interface UserService {

	
	List<User> findAll();
	User save(User user);
	Optional<User> findById(long id);
	
	
}
