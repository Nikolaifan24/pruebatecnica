package com.prueba.web.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.prueba.web.entities.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Long>{
    @Query(value = "SELECT * FROM Usuario u where u.FechaNacimiento =: FechaNacimiento", nativeQuery = true)
    List<Usuario> findByFechaNacimiento(@Param("FechaNacimiento") String FechaNacimiento);
    
    @Query(value = "SELECT * FROM Usuario u where u.nombre =: nombre", nativeQuery = true)
    List<Usuario> findByNombre(@Param("nombre") String nombre);

    @Query(value = "SELECT * FROM Usuario u where u.documento", nativeQuery = true)
    Usuario buscarUsuarioporDocumento(@Param("documento") Long documento);
}
