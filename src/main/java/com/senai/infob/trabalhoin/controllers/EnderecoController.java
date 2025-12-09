package com.senai.infob.trabalhoin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.trabalhoin.models.Endereco;
import com.senai.infob.trabalhoin.services.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    
    @Autowired
    public EnderecoService enderecoService;
    
    @GetMapping("/count")
    public long count(){
        return enderecoService.count();
    }

    @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco){
        return enderecoService.salvar(endereco);
    }
    
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        boolean deletou = enderecoService.delete(id);
        if (deletou) {
            return "Usuário removido com sucesso";        
        }
        return "Falha ao remover o usuário";

    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> atualizar(@PathVariable Integer id, @RequestBody Endereco endereco){
        boolean atualizado = enderecoService.atualizar(endereco);
        if(atualizado) {
            return ResponseEntity.ok("Atualizado com sucesso");
        }
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("falha na atualização");   
    }

    @GetMapping("/buscar/{id}")
    public Endereco buscar(@PathVariable Integer id){
        return enderecoService.buscar(id);
    }


    @GetMapping("/listar")
    public List<Endereco> listarTodos() {
        return enderecoService.listarTodos();
    }
}

