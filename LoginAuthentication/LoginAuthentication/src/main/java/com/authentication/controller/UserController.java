package com.authentication.controller;



import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.authentication.entities.User;
import com.authentication.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserController {

	private UserService userService;
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
//	@ModelAttribute("user")
//	public UserRegistrationDto userRegistrationDto() {
//		
//		return new UserRegistrationDto();
//	}
	@ModelAttribute("user")
	public User user() {
		
		return new User();
	}
	
	
	
	@GetMapping
	public String showform() {
		return "registration";
	}
	
	
	@PostMapping
	public String registerUser(@ModelAttribute("user") User user) {
//	public String registerUser(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		
	     
		
//		userService.save(registrationDto);
		this.userService.save(user);
		
		return "redirect:/registration?success";
		
	}
	
	
	
	
}
