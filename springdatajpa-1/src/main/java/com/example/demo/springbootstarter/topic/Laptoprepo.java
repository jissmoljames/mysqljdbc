package com.example.demo.springbootstarter.topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Laptoprepo extends CrudRepository<laptop1, Integer> {
	
}
