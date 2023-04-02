package com.spring.entregaFinal.carritoui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	public LoginController() {
		
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	@PostMapping("/login")
	public String loginPost(Model model) {
		return "redirect:/login";
	}
	
	@GetMapping("/menu")
	public String menu(Model model) {
		return "menu";
	}
	
	@PostMapping("/menu")
	public String menuPost(Model model) {
		return "redirect:/menu";
	}
	
	@GetMapping("/productos")
	public String productosGet(Model model) {
		return "productos";
	}
	
	@PostMapping("/productos")
	public String productosPost(Model model) {
		return "redirect:/productos";
	}
	
	@GetMapping("/marca")
	public String marcasGet(Model model) {
		return "marca";
	}
	
	@PostMapping("/marca")
	public String marcasPost(Model model) {
		return "redirect:/marca";
	}
	@GetMapping("/usuarios")
	public String usuariosGet(Model model) {
		return "usuarios";
	}
	
	@PostMapping("/usuarios")
	public String usuariosPost(Model model) {
		return "redirect:/usuarios";
	}
	@GetMapping("/categorias")
	public String categoriasGet(Model model) {
		return "categorias";
	}
	
	@PostMapping("/categorias")
	public String categoriasPost(Model model) {
		return "redirect:/categorias";
	}
	@GetMapping("/compras")
	public String comprasGet(Model model) {
		return "compras";
	}
	
	@PostMapping("/compras")
	public String comprasPost(Model model) {
		return "redirect:/compras";
	}
	@GetMapping("/nuevaCompra")
	public String nuevaCompraGet(Model model) {
		return "nuevaCompra";
	}
	
	@PostMapping("/nuevaCompra")
	public String nuevaCompraPost(Model model) {
		return "redirect:/nuevaCompra";
	}
}
