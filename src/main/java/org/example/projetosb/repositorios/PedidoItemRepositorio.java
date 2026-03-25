package org.example.projetosb.repositorios;

import org.example.projetosb.entidades.PedidoItem;
import org.example.projetosb.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoItemRepositorio extends JpaRepository<PedidoItem, Long> {

}

