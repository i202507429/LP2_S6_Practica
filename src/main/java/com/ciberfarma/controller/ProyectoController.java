package com.ciberfarma.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("proyecto")
public class ProyectoController {

	@PostMapping("saludar")
	public String Saludar(@RequestParam String nombre, Model model) {
		model.addAttribute("nombre", nombre);
		return "saludo";
	}
}
