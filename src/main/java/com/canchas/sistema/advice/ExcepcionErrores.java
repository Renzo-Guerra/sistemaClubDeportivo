package com.canchas.sistema.advice;

import com.canchas.sistema.advice.excepciones.ExcDeporteInvalido;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExcepcionErrores {

    @ExceptionHandler(ExcDeporteInvalido.class)
    public ResponseEntity<String> deporteSeleccionadoInvalido(ExcDeporteInvalido excepcion){
        return new ResponseEntity<>(excepcion.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
