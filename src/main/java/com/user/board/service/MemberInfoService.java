package com.user.board.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.common.model.Users;
import com.security.UserDetails;
import com.user.board.repository.MemberInfoRepository;

public class MemberInfoService {

	@Autowired
	private MemberInfoRepository memberInfoRepository;
	
	
public UserDetails loginChk(String userId, String userPwd) {
		
//		String rtnPage = "";
	
		UserDetails userDetails = new UserDetails();
		
		String hash512= "";
		Users userInfo  = memberInfoRepository.findByUserIdAndPassword(userId, hash512);
		
		
		Optional<Users> optUser = Optional.ofNullable(userInfo);
		if(!optUser.isPresent()) {
			return null;
		}
		
//		session.setAttribute("loginUser", userInfo);
		
		return userDetails;
	}
}
