package com.aksh.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.aksh.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
