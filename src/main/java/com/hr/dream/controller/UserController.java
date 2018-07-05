package com.hr.dream.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	

	@RequestMapping("/hello")
	public String toAdd(){

		return "hello";
	}



}
