package com.uni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class SignController {
	@RequestMapping("sign")
	public String home() {
		
		return "home/sign_login/signup.html";
	}
}
