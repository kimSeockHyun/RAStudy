package com.common.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.common.model.Users;
import com.common.repository.UserRepository;
import com.security.UserDetails;

public class LoginService {

	@Autowired
	private UserRepository userRepository;
	
	
public UserDetails loginChk(String userId, String userPwd) {
		
//		String rtnPage = "";
	
		UserDetails userDetails = new UserDetails();
		
		String hash512= "";
		Users userInfo  = userRepository.findByUserIdAndPassword(userId, hash512);
		
		Optional<Users> optUser = Optional.ofNullable(userInfo);
		if(!optUser.isPresent()) {
			return null;
		}
		
//		session.setAttribute("loginUser", userInfo);
		
		return userDetails;
	}
}
