package com.seleniumexpress.mvcpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//controller class
@Controller
public class StudentController {
	//@ResponseBody
	@RequestMapping("/aaa") 	
	public  String Student() {
		System.out.println("StudentController object created...");
		JDBC_Connectivity obj=new JDBC_Connectivity();
		obj.createConnection();
		
		return "aman";
	
	}	
	@GetMapping("/home")
	public String showStudentHomePage() {//method level pr controller bna
		System.out.println("inside /home endpoint");
//		return "now you are seeing  a student home page ";
		return "home-page";
	}
	@ResponseBody// agr ye lagaya to return "pratibha" hoga jsp page nhi s 
	@GetMapping("/pratibha")///pratibha url pr denge tb ye method  call hogi or return me jo bhi jsp page ka name denge wo browser pr print ho jayega
	public String showStudentPratibhaPage() {//method level pr controller bna
		System.out.println("inside /pratibha endpoint");
//		return "now you are seeing  a student home page ";
		return "pratibha";
	}
	@GetMapping("/anurag_bhaiya")
	public String showStudentAnuragPage() {//method level pr controller bna
		System.out.println("inside /anurag endpoint");
//		return "now you are seeing  a student home page ";
		return "anurag_bhaiya";
	}
	
	@GetMapping("/aman_bhaiya")
	public String showStudentAmanPage() {//method level pr controller bna
		System.out.println("inside /aman endpoint");
//		return "now you are seeing  a student home page ";
		return "aman_bhaiya";
	}

}
