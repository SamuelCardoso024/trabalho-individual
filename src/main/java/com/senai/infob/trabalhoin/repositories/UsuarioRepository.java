package com.senai.infob.trabalhoin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.senai.infob.trabalhoin.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    @Query(value = "select * from usuario where email = :email", nativeQuery = true)
    public Usuario findByEmail(String email);
}
