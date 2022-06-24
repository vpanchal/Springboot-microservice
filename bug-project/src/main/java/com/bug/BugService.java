package com.bug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BugService {

	@Autowired
	RestTemplate template;
	@Autowired
	BugRepository repo;
	
	
	void createBug(BugVO bugvo) {
		System.out.println("BugService.createOrder()");
		template.getForEntity("http://EMAIL-SERVICE/email/"+bugvo.getEmail(), String.class);
		repo.save(bugvo);
		
	}
	
	void listBug(Integer Id) {
		System.out.println("BugService.listorder()");
		repo.findById(Id);
	}
}
