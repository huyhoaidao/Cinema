package com.uni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class AdminController {
	@RequestMapping("admin")
	public String admin() {
		
		return "admin/admin.html";
	}
}
