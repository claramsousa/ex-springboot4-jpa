package org.example.projetosb.repositorios;

import org.example.projetosb.entidades.Categoria;
import org.example.projetosb.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {

}

