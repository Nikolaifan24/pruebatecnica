package com.prueba.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.web.dto.UsuarioDto;
import com.prueba.web.entities.Usuario;
import com.prueba.web.services.IUsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ControladorUsuario {
    
    @Autowired
    IUsuarioService iusuario;

    UsuarioDto usuarioDto;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/usuario/listar-usuario/{documento}")
    public UsuarioDto buscarUsuarioByDocumento(@PathVariable Long documento){
        return iusuario.buscarUsuarioporDocumento(documento);

    }
   
    @PostMapping("/crearusuario")
    public void crearUsuario(@RequestBody UsuarioDto usuarioDto) {
        //TODO: process POST request
        iusuario.crearUsuario(usuarioDto);
        
    }
    
    @DeleteMapping("/eliminarusuario/{documento}")
    public void eliminarUsuario(@PathVariable Long documento) {
        iusuario.eliminarUsuario(documento);
    }

    @PatchMapping("/actualizarusuario/{documento}")
    public void actualizarUsuario(@PathVariable Long documento,@RequestBody UsuarioDto usuarioDto) {
        iusuario.actualizarUsuario(documento, usuarioDto);
    }

    @GetMapping("/usuarioslistar")
    public List<Usuario> listartodo() {
        return iusuario.listarTodosLosUsuarios();
    }

    @GetMapping("/listar-usuario/{FechaNacimiento}")
    public List<Usuario> listarUsuarioxFechaNacimiento(@PathVariable String FechaNacimiento) {
        return iusuario.listarUsuariosPorFecha(FechaNacimiento);
    }
    

}
