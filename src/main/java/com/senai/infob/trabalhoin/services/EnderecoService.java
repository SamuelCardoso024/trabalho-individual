package com.senai.infob.trabalhoin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.trabalhoin.models.Endereco;
import com.senai.infob.trabalhoin.repositories.EnderecoRepository;

@Service
public class EnderecoService {
    
     @Autowired
    public EnderecoRepository enderecoRepository;
    
    public Long count(){
        return enderecoRepository.count();
        
    }

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public boolean delete(Integer id) {
        Endereco endereco = enderecoRepository.findById(id).get();
        if(endereco != null) {
            enderecoRepository.deleteById(id);
            return true;
        }
        return false;
    }
        public boolean update(Endereco endereco) {
            enderecoRepository.save(endereco);
            return true;

        }
          public boolean atualizar(Endereco endereco) {
           return  enderecoRepository.save(endereco) != null;
            
        } 

         public Endereco buscar(Integer id) {
        return enderecoRepository.findById(id).get();
         }
        
        public List<Endereco> listarTodos(){
          return enderecoRepository.findAll();
         }


}

