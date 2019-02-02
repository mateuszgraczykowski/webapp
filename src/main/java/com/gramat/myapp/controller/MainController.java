package com.gramat.myapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/")
    @ResponseBody
    public String home() {
      return "index";
    }
	
	@RequestMapping("/projects")
	public String showProjects() {
		return "projects";
	}
}
