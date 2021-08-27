package com.authentication.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.authentication.entities.Feedback;
import com.authentication.entities.User;
import com.authentication.repository.FeedRepository;
import com.authentication.repository.UserRepository;
import com.authentication.service.UserService;

@Controller
public class MainController {
	
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	FeedRepository feedRepository;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("users", userRepository.findAll());
		model.addAttribute("response", feedRepository.findAll());
		return "index";
	}
	
	
	@GetMapping("/show_details/{id}")
	public String show(@PathVariable("id") long id, Model model) {
		
		   User user = userRepository.findById(id)
				    .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
		model.addAttribute("user",user);
		return "show_details";
	}
	
	@GetMapping("/agent_rating")
	public String rating() {
	
		return "agent_rating";
	}
	
	@PostMapping("/feedsave")
	public String savefeed(@ModelAttribute("feedback") Feedback feedback) {
		
		 feedRepository.save(feedback);
		 return "redirect:/home";
	
	}
	
	
	
	
	
}