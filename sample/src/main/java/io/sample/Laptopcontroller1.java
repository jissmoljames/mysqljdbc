package io.sample;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Laptopcontroller1 {

	@Autowired
	private Laptopservice1 laptopservice;
	
	@RequestMapping("/topics")
	public List<laptop1>  getAllTopics(){
		return laptopservice.getAllTopics();
	}
	@RequestMapping("/topics/{id}")
	public laptop1  getTopics(@PathVariable String id){
		return laptopservice.getTopics(id);
	}
	

	
}

