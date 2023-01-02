package com.bolsadeideas.springboot.errors.app.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bolsadeideas.springboot.errors.app.errors.UsuarioNoEncontradoException;

@ControllerAdvice
public class ErrorHandlerController {
	
	@ExceptionHandler(ArithmeticException.class)
	public String aritmeticaError(ArithmeticException ex, Model model) {
		model.addAttribute("error", "Error de aritmética");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		//return "/error/aritmetica";
		return "/error/generica";
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public String numberFormatError(NumberFormatException ex, Model model) {
		model.addAttribute("error", "Error de formato numérico");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		//return "/error/formatonumero";
		return "/error/generica";
	}
	
	@ExceptionHandler(UsuarioNoEncontradoException.class)
	public String suarioNoEncontradoError(UsuarioNoEncontradoException ex, Model model) {
		model.addAttribute("error", "Error: Usuario no encontrado!");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "/error/usuario";
	}
}
