package com.security.zuulgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hi";
	}

}
