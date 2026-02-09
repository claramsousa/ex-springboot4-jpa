package org.example.projetosb.controladores;

import org.example.projetosb.entidades.Pedido;
import org.example.projetosb.servicos.PedidoServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoControlador {

    @Autowired
    private PedidoServicos servico;

    @GetMapping
    public ResponseEntity<List<Pedido>> findAll(){
        List<Pedido> lista = servico.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable Long id){
        Pedido obj = servico.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
