package com.zavialov.DAO.exeption;

public class NotFindExeption extends RuntimeException{
    public NotFindExeption(String msg) {
        super(msg);
    }
}