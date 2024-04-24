package com.adminViajes.modelo.servicio;

import java.util.List;

import com.adminViajes.modelo.entidad.Usuario;

public interface IUsuarioServicio {

	List<Usuario> findAll();

	 Usuario save(Usuario usuario);
	 Usuario buscarporId(Integer id);
	 void eliminar(Integer id);
	
}
