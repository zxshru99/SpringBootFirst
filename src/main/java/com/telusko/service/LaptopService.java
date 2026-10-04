package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.controller.Laptop;
import com.telusko.repository.LaptopRepository;
@Service
public class LaptopService {
	@Autowired
	private LaptopRepository repo;
	public void add (Laptop laptop) {
		repo.save(laptop);
		
		
	}
	public boolean gfp(Laptop lap) {
		return true;
	}

}
