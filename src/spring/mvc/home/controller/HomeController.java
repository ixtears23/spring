package spring.mvc.home.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.mvc.home.service.HomeServiceImpl;

@Controller
@RequestMapping(value="/home")
public class HomeController {
	
	@Autowired
	HomeServiceImpl homeService;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/start.do")
	public String start(ModelMap map) {
		ModelMap mav = new ModelMap();
		
		mav.put("test1", "abc1");
		mav.put("test2", "abc2");
		mav.put("test3", "abc3");
		mav.put("test4", "abc4");
		
		Map map2 = homeService.getUser("dori1");
		mav.addAllAttributes(map2);
		
		map.addAttribute("map", mav);
		map.addAttribute("map2", mav);
		
		return "/dori";
	}
}
