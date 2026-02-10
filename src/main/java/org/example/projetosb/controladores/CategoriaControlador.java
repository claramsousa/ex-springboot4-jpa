package org.example.projetosb.controladores;

import org.example.projetosb.entidades.Categoria;
import org.example.projetosb.servicos.CategoriaServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaControlador {

    @Autowired
    private CategoriaServicos servico;

    @GetMapping
    public ResponseEntity<List<Categoria>> findAll(){
        List<Categoria> lista = servico.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Long id){
        Categoria obj = servico.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
