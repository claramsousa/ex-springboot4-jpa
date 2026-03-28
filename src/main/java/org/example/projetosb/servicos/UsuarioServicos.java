package org.example.projetosb.servicos;

import jakarta.persistence.EntityNotFoundException;
import org.example.projetosb.entidades.Usuario;
import org.example.projetosb.repositorios.UsuarioRepositorio;
import org.example.projetosb.servicos.exceptions.DatabaseException;
import org.example.projetosb.servicos.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.RecoverableDataAccessException;
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
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Usuario insert(Usuario obj){
        return repositorio.save(obj);
    }

    public void delete(Long id){
        try {
            repositorio.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public Usuario update(Long id, Usuario obj){
        try{
            Usuario entity = repositorio.getReferenceById(id);
            updateData(entity,obj);
            return repositorio.save(entity);
        }catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(Usuario entity, Usuario obj) {
        entity.setNome(obj.getNome());
        entity.setEmail(obj.getEmail());
        entity.setTelefone(obj.getTelefone());

    }
}
