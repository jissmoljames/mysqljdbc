package io.sample;

import java.util.Arrays;

import java.util.List;

import org.springframework.stereotype.Service;





@Service
public class Laptopservice1 {

	private List<laptop1> top=Arrays.asList(
			new laptop1("1","Dell", "500GB"),
			new laptop1("2","Lenovo", "256GB"),
			new laptop1("3","HP", "1TB")
		);
	
	public List<laptop1> getAllTopics(){
		return top;

	}
	public laptop1 getTopics(String id) {
		return top.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
}
