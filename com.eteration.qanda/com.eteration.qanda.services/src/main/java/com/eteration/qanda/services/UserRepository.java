package com.eteration.qanda.services;

import org.springframework.data.repository.CrudRepository;

import com.eteration.qanda.models.User;
import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {
	public List<User> findByUserName(String username);
}
