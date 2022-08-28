package com.demand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demand.model.DemandModel;
import com.demand.repository.DemandRepo;

@RequestMapping("/")
@RestController
@Service
public class Controller {

	@Autowired
	private DemandRepo repo;
	
	@PostMapping("demand")
	public DemandModel saveDemand(@RequestBody DemandModel Data) {
		System.out.println("Customer Added!!!");
	      return repo.save(Data);
	}
	
	@GetMapping("demand/{did}")
	public DemandModel showDemand(@PathVariable("did") Long did) {
		
		DemandModel Person = repo.getBydid(did);
		return Person;
	}
	
}
