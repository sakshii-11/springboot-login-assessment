package com.authentication.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.multipart.MultipartFile;

import com.authentication.entities.Feedback;
import com.authentication.entities.User;
import com.authentication.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	
//	User save(UserRegistrationDto registrationDto);

	User save(User user);
	

}
