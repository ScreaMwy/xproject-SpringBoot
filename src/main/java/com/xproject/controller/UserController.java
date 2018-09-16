package com.xproject.controller;

import java.io.Serializable;
import java.util.Date;

import com.xproject.pojo.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = {"/user"})
@SuppressWarnings({"unused"})
public class UserController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ResponseBody
	@RequestMapping(path = {"/showUser"}, method = {RequestMethod.GET})
	public User showUser() {
		User user = new User();
		user.setName("Imooc");
		user.setAge("22");
		user.setBrithday(new Date());
		user.setPassword("imooc");
		user.setDesc(null);
		return user;
	}
}
