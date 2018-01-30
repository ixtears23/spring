package spring.mvc.home.service;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public interface HomeService {
	
	public Map<String, String> getUser(String id);
	public void setUser(Map<String, String> map);

	
	
	@PostConstruct
	public default void init() {
		System.out.println("HomeService @PostConstruct");
	}
	
	@PreDestroy
	public default void destroy() {
		System.out.println("HomeService @PreDestroy");
	}
}
