package com.renanazzolim.helpdesk.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.renanazzolim.helpdesk.api.entity.User;
import com.renanazzolim.helpdesk.api.repository.UserRepository;
import com.renanazzolim.helpdesk.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository UserRepository;

	@Override
	public User findByEmail(String email) {
		return this.UserRepository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		return this.UserRepository.save(user);
	}

	@Override
	public User findById(String id) {
		return this.UserRepository.findOne(id);
	}

	@Override
	public void delete(String id) {
		this.UserRepository.delete(id);
	}

	@Override
	public Page<User> findAll(int page, int count) {
		Pageable pages = new PageRequest(page, count);
		return this.UserRepository.findAll(pages);
	}

}
