package com.programmer.gate.controller;

import java.io.Serializable;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.programmer.gate.repository.Us001Repository;

@Controller
public class Us001Controller implements Serializable{
	
	@Autowired
	private Us001Repository us001Repository;
	
	
	@RequestMapping("/role")
    @ResponseBody
	public HashMap<String, Object> role(){
		HashMap<String, Object> plr = new HashMap<String, Object>();
			plr.put("data", us001Repository.findAll());
		return  plr;
	}
	
}
