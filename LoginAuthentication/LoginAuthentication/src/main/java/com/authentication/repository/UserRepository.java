package com.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authentication.entities.Feedback;
import com.authentication.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 
	User findByEmail(String email);


}
