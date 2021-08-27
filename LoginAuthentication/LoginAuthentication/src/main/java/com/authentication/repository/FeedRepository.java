package com.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authentication.entities.Feedback;

public interface FeedRepository extends JpaRepository<Feedback, Long> {
	
 
}
