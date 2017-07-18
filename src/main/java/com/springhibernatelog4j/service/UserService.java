package com.springhibernatelog4j.service;

import java.util.List;

import com.springhibernatelog4j.entity.User;

public interface UserService {

	List<User> findAll();

	User findOne(Integer id);
	
	void create(User user);

	void delete(User user);

	void update(User user);
}
