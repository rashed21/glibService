package com.programmer.gate.controller;

import java.io.Serializable;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.programmer.gate.model.St001;
import com.programmer.gate.repository.St001Repository;

@Controller
@RestController
public class St001Controller implements Serializable{
	
	@Autowired
	private St001Repository st001Repository;
	
	@RequestMapping("/status")
    @ResponseBody
	public HashMap<String, Object> role(){
		HashMap<String, Object> plr = new HashMap<String, Object>();
			plr.put("data", st001Repository.findAll());
		return  plr;
	}
	
	@PostMapping("/status/save")
	@ResponseBody
	public HashMap<String, Object> userRegisteration(@RequestBody St001 st001){
		HashMap<String, Object> plr = new HashMap<String, Object>();
		st001.setId(0);
		st001Repository.save(st001);
		plr.put("data", st001);
		return  plr;
	}
	
/*	@PostMapping("/status/save")
	@ResponseBody
	public HashMap<String, Object> userRegisteration(@RequestBody St001 st001){
		HashMap<String, Object> plr = new HashMap<String, Object>();
		plr.put("data", st001);
		return  plr;
	}
*/	
/*	@RequestMapping(value = "/status/save", method= RequestMethod.POST, produces="appilication/json")
	public HashMap<String, Object> userRegisteration(@RequestBody St001 st001){
		
		HashMap<String, Object> plr = new HashMap<String, Object>();
		
		plr.put("data", "success");
		return  plr;
	}
	
*/
	//Working bellow code.............
/*	@RequestMapping("/register")
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
    }*/
	

			
	
}
