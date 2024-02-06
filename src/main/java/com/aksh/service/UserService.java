package com.aksh.service;

import com.aksh.exception.UserException;
import com.aksh.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
