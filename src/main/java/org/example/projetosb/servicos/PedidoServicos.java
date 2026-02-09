package org.example.projetosb.servicos;

import org.example.projetosb.entidades.Pedido;
import org.example.projetosb.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServicos {

    @Autowired
    private PedidoRepositorio repositorio;

    public List<Pedido> findAll(){
        return repositorio.findAll();
    }

    public Pedido findById(Long id){
        Optional<Pedido> obj = repositorio.findById(id);
        return obj.get();
    }
}
