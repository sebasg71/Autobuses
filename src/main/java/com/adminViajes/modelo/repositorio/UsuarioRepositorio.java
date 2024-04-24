package com.adminViajes.modelo.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.adminViajes.modelo.entidad.Usuario;
import java.util.List;


public interface UsuarioRepositorio  extends CrudRepository<Usuario, Integer>{

    List<Usuario> findByCorreo(String correo);

}
