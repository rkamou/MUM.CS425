package edu.mum.cs423.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

	@GetMapping(value= {"/","/library"})
	public String displayHomePage() {
		return "home/index";
	}
}
