package com.example.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LaptopRepository extends CrudRepository<laptop1, Integer> {
	
}
