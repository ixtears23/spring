package spring.mvc.home.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User {

	
	@PostConstruct
	public void init() {
		System.out.println("User @PostConstruct");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("User @PreDestroy");
	}
}
