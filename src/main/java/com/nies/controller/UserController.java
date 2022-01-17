package com.nies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

	@RequestMapping("/user")
	public String index(HttpServletRequest request){
		request.setAttribute("msg","el表达式");
		return "index";
	}

}
