package com.example.demo.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class Laptopservice1 {
	
	@Autowired
	private Laptoprepo laptoprep;
	
				private List<laptop1> top= new ArrayList<>(Arrays.asList(
				new laptop1("1","Dell", "500GB"),
				new laptop1("2","Lenovo", "256GB"),
				new laptop1("3","HP", "1TB")
			));
		
		public List<laptop1> getAllTopics(){
			List<laptop1> top =new ArrayList<>();
				laptoprep.findAll()
					.forEach(top::add);
					return top;

		}
		public laptop1 getTopic(int id) {
			return top.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		}
		public void addTopic(laptop1 lap) {
			laptoprep.save(lap);
			
		}
		public void updateTopic(int id, laptop1 lap) {
			for(int i=0; i<top.size(); i++) {
				laptop1 t= top.get(i);
				if(t.getId().equals(id)) {
					top.set(i, lap);
					return;
				}
			
		}
		}
		public void deleteTopic(int id, laptop1 lap) {
			for(int i=0; i<top.size(); i++) {
				laptop1 t= top.get(i);
				if(t.getId().equals(id)) {
					top.remove(i);
					return;
				
				}
			}
			
		}
	
}
