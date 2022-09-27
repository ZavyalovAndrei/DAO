package com.zavialov.DAO.exeption;

public class EmptyRequestExeption extends RuntimeException{
    public EmptyRequestExeption(String msg) {
        super(msg);
    }
}