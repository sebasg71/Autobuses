package com.adminViajes.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.adminViajes.modelo.entidad.Usuario;
import com.adminViajes.modelo.servicio.IUsuarioServicio;


@Controller
public class UsuarioControlador {

    @Autowired
    private IUsuarioServicio service;
    
    
        @PostMapping("/api/users")
        public String crearUsuario(@ModelAttribute Usuario usuario, RedirectAttributes redirectAttributes) {
            // Procesa la creación de un nuevo usuario usando los datos recibidos del formulario
            service.save(usuario);
            
            // Agrega un mensaje de éxito para mostrar al usuario
            redirectAttributes.addFlashAttribute("mensaje", "¡Usuario creado exitosamente! Por favor, inicia sesión.");
    
            // Redirige al usuario a la página de inicio de sesión
            return "redirect:/login";
        }
    
}
