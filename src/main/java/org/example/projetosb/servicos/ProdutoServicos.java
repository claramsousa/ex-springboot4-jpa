package org.example.projetosb.servicos;

import org.example.projetosb.entidades.Produto;
import org.example.projetosb.repositorios.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServicos {

    @Autowired
    private ProdutoRepositorio repositorio;

    public List<Produto> findAll(){
        return repositorio.findAll();
    }

    public Produto findById(Long id){
        Optional<Produto> obj = repositorio.findById(id);
        return obj.get();
    }
}
