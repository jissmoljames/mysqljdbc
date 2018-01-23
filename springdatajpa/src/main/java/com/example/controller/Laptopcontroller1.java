package com.example.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Laptopcontroller1 {

	@Autowired
	private Laptopservice1 topicservice;
	
	@RequestMapping(method=RequestMethod.GET, value="/topics")
	public List<laptop1>  getAllTopics(){
		return topicservice.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public laptop1 getTopic(@PathVariable int id){
		return topicservice.getTopic(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody laptop1 lap){
		topicservice.addTopic(lap);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody laptop1 lap, @PathVariable int id){
		topicservice.updateTopic(id, lap);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@RequestBody laptop1 lap, @PathVariable int id){
		topicservice.deleteTopic(id, lap);
	}
}

