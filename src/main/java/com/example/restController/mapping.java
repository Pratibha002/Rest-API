package com.example.restController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mapping {

	@GetMapping("/amanBhaiya")
	public String test() {
		System.out.println("get method");
		return "getMapping is used to retrieve the data............";
	}
	
	@PostMapping("/bhanu")
	public String test2() {
		System.out.println("post method");
		return "postMapping is used to create new resources............";
	}
	
	@PutMapping("/pratibha")
	public String test3() {
		System.out.println("put method");
		return "putMapping is used to update the data............";
	}
	
	@DeleteMapping("/ruchi")
	public String test4() {
		System.out.println("delete method");
		return "deleteMapping is used to delete the data............";
	}
}
