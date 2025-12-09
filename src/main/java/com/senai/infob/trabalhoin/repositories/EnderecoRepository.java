package com.senai.infob.trabalhoin.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.infob.trabalhoin.models.Endereco;


public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    
}