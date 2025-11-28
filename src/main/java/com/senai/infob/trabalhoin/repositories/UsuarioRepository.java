package com.senai.infob.trabalhoin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.infob.trabalhoin.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
}
