package com.user.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class LoginController {
	
	 // 로그인 페이지
	@GetMapping(value = "/")
	public String main( HttpServletRequest request, HttpServletResponse response, ModelAndView mav )throws Exception {
		return "index";
	}   
	 // 로그인 페이지
	@GetMapping(value = "/1")
	public String main2( HttpServletRequest request, HttpServletResponse response, ModelAndView mav )throws Exception {
		return "index2";
	}   
	
	 // 로그인 페이지
	@GetMapping(value = "/user/login")
	public String login( HttpServletRequest request, HttpServletResponse response, ModelAndView mav )throws Exception {
		return "/com/user/login/login";
	}   
}
