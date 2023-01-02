package com.bolsadeideas.springboot.errors.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.errors.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;
	
	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Paco", "Pérez"));
		this.lista.add(new Usuario(2, "Pepe", "García"));
		this.lista.add(new Usuario(3, "Luci", "Mena"));
		this.lista.add(new Usuario(4, "Javier", "Fernández"));
		this.lista.add(new Usuario(5, "Sandra", "Sanz"));
		this.lista.add(new Usuario(6, "Juan", "Gil"));
		this.lista.add(new Usuario(7, "Francisco", "Marín"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		for(Usuario u: lista) {
			if(u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		return resultado;
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		Usuario usuario = this.obtenerPorId(id);
		return Optional.ofNullable(usuario);
	}

}
