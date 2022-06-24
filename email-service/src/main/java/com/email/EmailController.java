package com.email;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	@GetMapping("/email/{emailaddress}")
	String sendMail(@PathVariable("emailaddress")  String emailaddress) {
		System.out.println(emailaddress);
		return "sent successfully"; 
	}
}
