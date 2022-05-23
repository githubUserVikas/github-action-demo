package com.githubccid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCcidDemoApplication {

	@GetMapping("/welcome")
	public String welcome() {
		System.out.println("We are commitig in local repository");
		return "Welcome to Github CICD Configuration";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GithubCcidDemoApplication.class, args);
	}

}
