package com.user.login.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.security.UserDetails;
import com.user.login.model.Users;
import com.user.login.repository.UserRepository;

public class LoginService {

	@Autowired
	private UserRepository userRepository;
	
	
public UserDetails loginChk(String userId, String userPwd) {
		
//		String rtnPage = "";
	
		UserDetails userDetails = new UserDetails();
		
		String hash512= "";
		Users userInfo  = userRepository.findByUserIdAndUserPw(userId, hash512);
		
		
		Optional<Users> optUser = Optional.ofNullable(userInfo);
		if(!optUser.isPresent()) {
			return null;
		}
		
//		session.setAttribute("loginUser", userInfo);
		
		return userDetails;
	}
}
