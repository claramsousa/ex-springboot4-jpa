package org.example.projetosb.servicos;

import org.example.projetosb.entidades.Categoria;
import org.example.projetosb.repositorios.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServicos {

    @Autowired
    private CategoriaRepositorio repositorio;

    public List<Categoria> findAll(){
        return repositorio.findAll();
    }

    public Categoria findById(Long id){
        Optional<Categoria> obj = repositorio.findById(id);
        return obj.get();
    }
}
