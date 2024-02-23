package com.prueba.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.web.dto.UsuarioDto;
import com.prueba.web.entities.Usuario;
import com.prueba.web.repositories.IUsuario;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioImp implements IUsuarioService{
    @Autowired
    public
    IUsuario iUsuario;

    @Override
    public void crearUsuario(UsuarioDto UsuarioDto){
        iUsuario.save(buildUsuario(UsuarioDto));
    }
    private Usuario buildUsuario(UsuarioDto UsuarioDto){
        Usuario usuario = new Usuario();
        Long IDUsuario = UsuarioDto.getIDUsuario();
        String nombre = UsuarioDto.getNombre();
        Long documento = UsuarioDto.getDocumento();
        String FechaNacimiento = UsuarioDto.getFechaNacimiento();

        if(IDUsuario != null){
            usuario.setIDUsuario(IDUsuario);
        }
        if(nombre != null){
            usuario.setNombre(nombre);
        }
        if(documento != null){
            usuario.setDocumento(documento);
        }
        if(FechaNacimiento != null){
            usuario.setFechaNacimiento(FechaNacimiento);
        }
        return usuario;
    }

    private void updateUsuario(UsuarioDto UsuarioDto, Usuario usuario){
        Long IDUsuario = UsuarioDto.getIDUsuario();
        String nombre = UsuarioDto.getNombre();
        Long documento = UsuarioDto.getDocumento();
        String FechaNacimiento = UsuarioDto.getFechaNacimiento();
        if(IDUsuario != null){
            usuario.setIDUsuario(IDUsuario);
        }
        if(nombre != null){
            usuario.setNombre(nombre);
        }
        if(documento != null){
            usuario.setDocumento(documento);
        }
        if(FechaNacimiento != null){
            usuario.setFechaNacimiento(FechaNacimiento);
        }
    }

    @Override
    public UsuarioDto buscarUsuarioporDocumento(Long documento){
        Usuario usuario = null;
        try{
            usuario = iUsuario.buscarUsuarioporDocumento(documento);
            UsuarioDto usuarioDto = mapUsuarioDto(usuario);
            return usuarioDto;
        }
        catch(Exception e) {
            return null;
        }
    }
        
    private UsuarioDto mapUsuarioDto(Usuario usuario) {
        return new UsuarioDto(
            usuario.getIDUsuario(),
            usuario.getNombre(),
            usuario.getDocumento(),
            usuario.getFechaNacimiento()
        );
    }
    
    @Override
    public void eliminarUsuario(Long documento){
        Usuario usuario = iUsuario.buscarUsuarioporDocumento(documento);
        iUsuario.delete(usuario);
    }

    @Override
    public void actualizarUsuario(Long documento, UsuarioDto usuarioDto){
        Usuario usuario = iUsuario.buscarUsuarioporDocumento(documento);
        updateUsuario(usuarioDto, usuario);
    }

    @Override
    public List<Usuario> listarTodosLosUsuarios(){
        return (List<Usuario>) iUsuario.findAll();
    }
    
    @Override
    public List<Usuario> listarUsuariosPorFecha(String FechaNacimiento){
        List<Usuario> lista = new ArrayList<Usuario> ();
        lista = iUsuario.findByFechaNacimiento(FechaNacimiento);
        return (lista);
    }
    
}
