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

    public Usuario insert(Usuario obj){
        return repositorio.save(obj);
    }

    public void delete(Long id){
        repositorio.deleteById(id);
    }

    public Usuario update(Long id, Usuario obj){
        Usuario entity = repositorio.getReferenceById(id);
        updateData(entity,obj);
        return repositorio.save(entity);
    }

    private void updateData(Usuario entity, Usuario obj) {
        entity.setNome(obj.getNome());
        entity.setEmail(obj.getEmail());
        entity.setTelefone(obj.getTelefone());

    }
}
