package org.example.projetosb.controladores;

import org.example.projetosb.entidades.Produto;
import org.example.projetosb.servicos.ProdutoServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoControlador {

    @Autowired
    private ProdutoServicos servico;

    @GetMapping
    public ResponseEntity<List<Produto>> findAll(){
        List<Produto> list = servico.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id){
        Produto obj = servico.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
