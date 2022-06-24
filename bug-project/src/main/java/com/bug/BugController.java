package com.bug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bug")
public class BugController {
	
	@Autowired
	BugService bugService;
	
	public void createBug(@RequestBody BugVO bugvo) {
		bugService.createBug(bugvo);
		System.out.println("BugController.createBug()");
	}
	
	@GetMapping("/{id}")
	public BugVO getBug(Integer id)
	{
		System.out.println("OrderController.getOrder()");
	 return new BugVO();
	}
	
	

}
