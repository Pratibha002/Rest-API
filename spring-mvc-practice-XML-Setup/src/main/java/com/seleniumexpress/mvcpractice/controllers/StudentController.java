package com.seleniumexpress.mvcpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	@ResponseBody
		
	@GetMapping("/home")
	public String showStudentHomePage() {
		System.out.println("inside /home endpoint");
		return "now you are seeing  a student home page....... ";
		
	}

}
