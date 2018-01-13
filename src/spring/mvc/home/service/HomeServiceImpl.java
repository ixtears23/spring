package spring.mvc.home.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import spring.mvc.home.mapper.HomeMapper;

@Service(value="homeService")
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	HomeMapper homeMapper;
	
	@SuppressWarnings("rawtypes")
	@Override
	public Map getUser(String id) {
		return homeMapper.getUser(id);
	}

}
