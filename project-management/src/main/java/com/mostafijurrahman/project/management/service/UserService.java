package com.mostafijurrahman.project.management.service;

import com.mostafijurrahman.project.management.dto.UserRegistrationDto;
import com.mostafijurrahman.project.management.model.User;

import org.springframework.security.core.userdetails.UserDetailsService;


import java.util.List;

public interface UserService extends UserDetailsService {

	User save(UserRegistrationDto registrationDto);

	List<User> getAll();
}
