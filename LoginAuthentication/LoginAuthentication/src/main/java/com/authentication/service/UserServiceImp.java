package com.authentication.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.authentication.entities.Feedback;
import com.authentication.entities.User;
import com.authentication.repository.FeedRepository;
import com.authentication.repository.UserRepository;
import com.authentication.web.dto.UserRegistrationDto;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	FeedRepository feedRepository;
	
	@Autowired
	UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public UserServiceImp(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

//	@Override
//	public User save(UserRegistrationDto registrationDto) {
//		User user = new User(registrationDto.getFirstName(), 
//				registrationDto.getLastName(), registrationDto.getEmail(),
//				passwordEncoder.encode(registrationDto.getPassword()));
//		
//		return userRepository.save(user);
//	}

	
	@Override
	public User save(User user) {
		  String encodedPassword = passwordEncoder.encode(user.getPassword());
		  user.setPassword(encodedPassword);
		 
		return userRepository.save(user);
		
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		User user = userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		 return new CustomUserDetails(user);	
	}

	
	
	
	
	
	
}