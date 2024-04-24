package com.adminViajes.modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminViajes.modelo.entidad.Usuario;
import com.adminViajes.modelo.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicio implements IUsuarioServicio{
	
	@Autowired
	private UsuarioRepositorio usuariorepositorio;

	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) usuariorepositorio.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		usuario.setRol("USER");
		return usuariorepositorio.save(usuario);
	}

	@Override
	public Usuario buscarporId(Integer id) {
		return usuariorepositorio.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Integer id) {
		usuariorepositorio.deleteById(id);
	}
	
}
