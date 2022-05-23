package com.githubccid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class GithubCcidDemoApplication {

	@GetMapping("/getOrderData/{orderId}")
	public String welcome(@RequestParam("orderId") String orderId) {
		System.out.println("We are commitig in local repository"+orderId);
		return "Welcome to Github CICD Configuration"+orderId;
	}

	@PostMapping("/updateData")
	public String postMessage(@RequestBody Order order) {
		System.out.println("We are commitig in local repository");
		return "Hi "+order.getOrderId()+": Order Name :"+order.getOrderName();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GithubCcidDemoApplication.class, args);
	}

}
