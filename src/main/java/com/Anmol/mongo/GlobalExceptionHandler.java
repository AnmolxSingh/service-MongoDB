package com.Anmol.mongo;

import com.Anmol.mongo.exception.InvalidTypeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(InvalidTypeException.class)
    ResponseEntity<String> IdNotFound (InvalidTypeException e){
        return new ResponseEntity<>("exception caught: "+e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
