package org.example.projetosb;

import org.example.projetosb.repositorios.UsuarioRepositorio;
import org.example.projetosb.servicos.UsuarioServicos;
import org.example.projetosb.servicos.exceptions.ResourceNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class UsuarioServicosTest {

    @Mock
    private UsuarioRepositorio repositorio;


    @InjectMocks
    private UsuarioServicos servico;

    @Test
    public void deveriaLancarExcecaoQuandoIdNaoExistir(){
        Long idInexistente = 100L;
        Mockito.when(repositorio.findById(idInexistente)).thenReturn(Optional.empty());

        Assertions.assertThrows(ResourceNotFoundException.class, () -> {
            servico.findById(idInexistente);
        });

        Mockito.verify(repositorio, Mockito.times(1)).findById(idInexistente);
    }


}
