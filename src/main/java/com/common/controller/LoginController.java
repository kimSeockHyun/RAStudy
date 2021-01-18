package com.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/common/")
public class LoginController {
	
	
	 // 로그인 페이지
	@GetMapping(value = "/login")
	public String login( HttpServletRequest request, HttpServletResponse response, ModelAndView mav )throws Exception {
		return "login";
	}
	
	
}
