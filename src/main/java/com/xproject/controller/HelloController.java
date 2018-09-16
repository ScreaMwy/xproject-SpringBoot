package com.xproject.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController //(@RestController) <=> (@Controller + @ResponseBody) 
@RequestMapping(path = {"/hc"})
@SuppressWarnings({"unused"})
public class HelloController {
	public HelloController() {}
	
	@RequestMapping(path = {"/hello"})
	public String hello() {
		return "Hello SpringBoot";
	}
}
