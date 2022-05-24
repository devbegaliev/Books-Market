package com.example.books.exepsion;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<?> exception(BadRequest a) {
        return ResponseEntity.badRequest().body(a.getMessage());
    }
}
