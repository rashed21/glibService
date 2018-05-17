package com.programmer.gate.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
	
	@RequestMapping(value = "/user/register", method= RequestMethod.POST, produces="appilication/json")
	public HashMap<String, Object> userRegisteration(@RequestBody Us002 user){
		
		HashMap<String, Object> plr = new HashMap<String, Object>();
		
		plr.put("data", "success");
		return  plr;
	}
	
/*	@PostMapping(value = "/register")
	public HashMap<String, Object>  saveColor(@RequestBody Us002 user, BindingResult bindingResult) {
		HashMap<String, Object> plr = new HashMap<String, Object>();
		plr.put("data", "success");
		return plr;
	}*/
	
	//Working bellow code.............
	@RequestMapping("/register")
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseStatus(HttpStatus.CREATED) HashMap<String, Object> add(@RequestBody() String user) {
		ObjectMapper mapper=new ObjectMapper();
		try {
			Us002 users=mapper.readValue(user, Us002.class);
			System.out.println(users.getUserName());
			
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HashMap<String, Object> plr = new HashMap<String, Object>();
		plr.put("data", user);
		return plr;
    }
	
	
/*	@RequestMapping( value="/register", method = RequestMethod.POST,produces="application/json")
    public String loginUser(@RequestBody Us002 requestBody) {
		System.out.println("I am calling.............");
		return null;
	}*/
	
	
/*	@PostMapping("/user/register")
	@ResponseBody
	public HashMap<String, Object> userRegisteration(){
		
		HashMap<String, Object> plr = new HashMap<String, Object>();
		
		plr.put("data", "success");
		return  plr;
	}
*/	
	
	/*	@RequestMapping(value = "register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(HttpStatus.CREATED)
		public void handleJsonPostRequest (@RequestBody Us002 user, Model model) {
		System.out.println("saving user: "+user);
		}*/
			
	
}
