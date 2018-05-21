package com.programmer.gate.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.InterceptingAsyncClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.programmer.gate.model.Us002;
import com.programmer.gate.model.Us002Id;
import com.programmer.gate.repository.Us002Repository;

@Controller
@RestController
public class Us002Controller implements Serializable{
	
	@Autowired
	private Us002Repository us002Repository;
	
	@RequestMapping("/user")
    @ResponseBody
	public HashMap<String, Object> role(){
		HashMap<String, Object> plr = new HashMap<String, Object>();
			plr.put("data", us002Repository.findAll());
		return  plr;
	}
	
	@RequestMapping(value = "/user/register")
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String, Object> userRegisteration(@RequestBody Us002 user){
		HashMap<String, Object> plr = new HashMap<String, Object>();
		
		int lastId= us002Repository.findAll().hashCode();
		user.setId(new Us002Id(lastId, 1));
		us002Repository.save(user);
		
		plr.put("data", user);
		return  plr;
	}
	
	@RequestMapping(value = "/user/login")
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String, Object> userLogin(@RequestBody Us002 user){
		HashMap<String, Object> plr = new HashMap<String, Object>();
		
		
		System.out.println(user.getUserName()+ " And "+user.getPassword());
		String logStatus;
		Us002 userHas= us002Repository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
		if(userHas != null){
			logStatus="User has match";
		}else{
			logStatus="User or Password is wrong";
		}
		plr.put("msg", logStatus);
		plr.put("data", userHas);
		return  plr;
	}

	
	
	
}
