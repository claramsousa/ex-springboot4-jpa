package org.example.projetosb.controladores;

import org.example.projetosb.entidades.Usuario;
import org.example.projetosb.servicos.UsuarioServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicos servico;

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll(){
        List<Usuario> lista = servico.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id){
        Usuario obj = servico.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
