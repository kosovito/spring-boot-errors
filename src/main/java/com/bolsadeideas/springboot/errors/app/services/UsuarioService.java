package com.bolsadeideas.springboot.errors.app.services;

import java.util.List;
import java.util.Optional;

import com.bolsadeideas.springboot.errors.app.models.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();
	public Usuario obtenerPorId(Integer id);
	public Optional<Usuario> obtenerPorIdOptional(Integer id);
}
