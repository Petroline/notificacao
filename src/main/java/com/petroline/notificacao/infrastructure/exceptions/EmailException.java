package com.petroline.notificacao.infrastructure.exceptions;

public class EmailException extends RuntimeException{

    public EmailException(String mensangem){
        super(mensangem);
    }
    public EmailException(String mesagem, Throwable throwable){
        super(mesagem, throwable);
    }
}
