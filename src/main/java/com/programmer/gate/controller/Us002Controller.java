package com.programmer.gate.controller;

import java.io.Serializable;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.programmer.gate.model.Response;
import com.programmer.gate.model.Us002;
import com.programmer.gate.model.Us002Id;
import com.programmer.gate.repository.Us002Repository;

@Controller
@RestController
public class Us002Controller implements Serializable{
	
	@Autowired
	private Us002Repository us002Repository;
	
	Response response;
	
	HashMap<String, Object> plr = new HashMap<String, Object>();
	
	@RequestMapping("/user")
    @ResponseBody
	public HashMap<String, Object> role(){
		plr.put("data", new Response("200", us002Repository.findAll()));
		return plr;
	}
	
	@RequestMapping(value = "/user/register")
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String, Object> userRegisteration(@RequestBody Us002 user){
		
		int lastId= us002Repository.findAll().hashCode();
		user.setId(new Us002Id(lastId, 1));
		us002Repository.save(user);
		
		plr.put("data", new Response("200", user));
		return plr;
	}
	
	@RequestMapping(value = "/user/login")
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String, Object> userLogin(@RequestBody Us002 user){
			
		Us002 userHas= us002Repository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
		
		if(userHas != null){
			plr.put("data", new Response("200", userHas));
		}else{
			plr.put("data", new Response("500", "User or password invalid"));
		}
		return  plr;
	}

	
	
	
}
