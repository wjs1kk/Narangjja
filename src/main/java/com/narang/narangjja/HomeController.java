package com.narang.narangjja;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("inquiry")
	public String inquiry() {
		
		return "inQuiry";
	}
}
