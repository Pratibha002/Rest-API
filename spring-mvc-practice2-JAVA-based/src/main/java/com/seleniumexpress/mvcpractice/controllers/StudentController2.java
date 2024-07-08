package com.seleniumexpress.mvcpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController2 {
	@ResponseBody
	@GetMapping("/test")
	public String showStudentHomePage() {
		
//		return "now you are seeing  a student home page ";
		return "testing.........";
	}

}
