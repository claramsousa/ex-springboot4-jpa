package org.example.projetosb.servicos;

import org.example.projetosb.entidades.Usuario;
import org.example.projetosb.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicos {

    @Autowired
    private UsuarioRepositorio repositorio;

    public List<Usuario> findAll(){
        return repositorio.findAll();
    }

    public Usuario findById(Long id){
        Optional<Usuario> obj = repositorio.findById(id);
        return obj.get();
    }
}
