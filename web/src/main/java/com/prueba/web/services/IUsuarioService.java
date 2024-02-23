package com.prueba.web.services;



import java.util.List;

import com.prueba.web.dto.UsuarioDto;
import com.prueba.web.entities.Usuario;

public interface IUsuarioService {
    
    UsuarioDto buscarUsuarioporDocumento(Long documento);

    void crearUsuario(UsuarioDto UsuarioDto);

    void eliminarUsuario(Long documento);

    void actualizarUsuario(Long documento, UsuarioDto usuarioDto);

    List<Usuario> listarTodosLosUsuarios();

    List<Usuario> listarUsuariosPorFecha(String FechaNacimiento);


}
