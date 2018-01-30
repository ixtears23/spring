package spring.mvc.home.service;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import spring.mvc.home.mapper.HomeMapper;

@Service(value="homeService")
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	HomeMapper homeMapper;
	
	@Override
	public Map<String, String> getUser(String id) {
		return homeMapper.getUser(id);
	}

	@Override
	public void setUser(Map<String, String> map) {
		String id = (String) map.get("id");
		String name = (String) map.get("name");
		String password = (String) map.get("password");
		
		homeMapper.setUser(id, name, password);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("HomeServiceImpl @PostConstruct");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("HomeServiceImpl @PreDestroy");
	}

}
