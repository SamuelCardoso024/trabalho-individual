package com.senai.infob.trabalhoin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.trabalhoin.models.Usuario;
import com.senai.infob.trabalhoin.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
     @Autowired
    public UsuarioRepository usuarioRepository;
    
    public Long count(){
        return usuarioRepository.count();
        
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean delete(Integer id) {
        Usuario usuario = usuarioRepository.findById(id).get();
        if(usuario != null) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
        public boolean update(Usuario usuario) {
            usuarioRepository.save(usuario);
            return true;

        }
          public boolean atualizar(Usuario usuario) {
           return  usuarioRepository.save(usuario) != null;
            
        } 

         public Usuario buscar(Integer id) {
        return usuarioRepository.findById(id).get();
         }
        
        public List<Usuario> listarTodos(){
          return usuarioRepository.findAll();
         }


}
