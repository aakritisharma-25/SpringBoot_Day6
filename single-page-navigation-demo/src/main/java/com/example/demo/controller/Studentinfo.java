package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Studentinfo {
	@GetMapping("/student")
	public String about(Model model) {
		model.addAttribute("title", "student");
		model.addAttribute("message", "Aditi, btech cse, sem 7, lpu");
		return "student";
	}
}
