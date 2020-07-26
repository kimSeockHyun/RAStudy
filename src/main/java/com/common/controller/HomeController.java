package com.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class HomeController {
	
	 //메인 페이지
	@RequestMapping(value = {"/", "/main"} )
	public String main( HttpServletRequest request, HttpServletResponse response, ModelAndView mav )throws Exception {
		return "index";
	}
	
}
