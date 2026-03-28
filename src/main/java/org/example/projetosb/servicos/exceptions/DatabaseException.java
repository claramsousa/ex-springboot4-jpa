package org.example.projetosb.servicos.exceptions;


public class DatabaseException extends RuntimeException{

    public DatabaseException(String msg){
        super(msg);
    }
}
