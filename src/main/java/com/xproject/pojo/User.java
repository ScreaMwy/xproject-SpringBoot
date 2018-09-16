package com.xproject.pojo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings({"unused"})
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	@JsonIgnore
	private String password;
	
	private String age;
	
	@JsonFormat(pattern = "yyyy-mm-dd hh:mm:ss a", locale = "zh", timezone = "GMT+8")
	private Date brithday;
	
	private String desc;
	
	public User() {}

	public User(String name, String password, String age, Date brithday, String desc) {
		this.name = name;
		this.password = password;
		this.age = age;
		this.brithday = brithday;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Date getBrithday() {
		return brithday;
	}

	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + ", brithday=" + brithday + ", desc="
				+ desc + "]";
	}
}
