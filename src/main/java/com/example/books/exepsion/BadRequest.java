package com.example.books.exepsion;

public class BadRequest extends RuntimeException{
    public BadRequest(String message){
        super(message);
    }
}

