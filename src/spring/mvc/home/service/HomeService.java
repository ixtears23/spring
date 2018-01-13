package spring.mvc.home.service;

import java.util.Map;

public interface HomeService {
	
	@SuppressWarnings("rawtypes")
	public Map getUser(String id);

}
