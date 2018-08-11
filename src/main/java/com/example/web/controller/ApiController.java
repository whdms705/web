package com.example.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {
	
	private final Logger log = LoggerFactory.getLogger(ApiController.class);
	
	@GetMapping("/1")
    public String web1() {
		log.info("web1_ver01 >> /1");
		return "web1_ver01";
    }
	
	@GetMapping("/2")
    public String web2() {
		log.info("web2_ver01 >> /2");
		return "web2_ver01";
    }

}
