package spring.mvc.home.controller;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.home.service.HomeServiceImpl;

@Controller
@RequestMapping(value="/home")
public class HomeController {
	
	private static final Logger logger = LogManager.getLogger(HomeController.class);
	@Autowired
	HomeServiceImpl homeService;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/start.do")
	public String start(@RequestBody(required=false) String param, ModelMap map) {
		logger.error("[error]");
		logger.info("[info]");
		logger.debug("[debug]");
		logger.fatal("[fatal]");
		logger.warn("[warn]");
		logger.trace("[trace]");
		ModelMap mav = new ModelMap();
		System.out.println("test");
		mav.put("test1", "abc1");
		mav.put("test2", "abc2");
		mav.put("test3", "abc3");
		mav.put("test4", "abc4");
		Map map2 = homeService.getUser("dori1");
		mav.addAllAttributes(map2);
		return "/dori";
	}
	
	
	@RequestMapping("/getUser.json")
	public Map<String, String> getUser() {
		
		Map<String, String> map = homeService.getUser("dori1");
		
		return map;
	}
	
	@RequestMapping("/setUser.json")
	public String setUser(@RequestParam Map<String, String> map) {
		homeService.setUser(map);
		
		return "성공했습니다.";
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("HomeController @PostConstruct");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("HomeController @PreDestroy");
	}
		
}
