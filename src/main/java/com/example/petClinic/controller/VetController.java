package com.example.petClinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.petClinic.services.VetService;

@Controller
@RequestMapping("/vet")
public class VetController {
	
	private final VetService vetService;
	

	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}


	@RequestMapping({"/", "/index", ""})
	public String listVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}
}
