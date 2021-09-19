package com.test.gitjenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitJenkinsApplication {
	public static Logger log = LoggerFactory.getLogger(GitJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		log.info("Application started....");
	}
	
	public static void main(String[] args) {
		log.info("Application executed....");
		SpringApplication.run(GitJenkinsApplication.class, args);
	}

}
