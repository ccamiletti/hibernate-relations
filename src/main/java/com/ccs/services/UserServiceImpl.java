package com.ccs.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ccs.model.User;
import com.ccs.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userRepository.findAll();
	}

	public User save(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public Optional<User> findById(long id) {
		// TODO Auto-generated method stub
		return this.userRepository.findById(id);
	}


	
	
}
