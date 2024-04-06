package com.app.demo.errorhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalErrorHandler {

    @ExceptionHandler(HttpMessageConversionException.class)
    public ResponseEntity<String> handleHttpMessageConversionException(HttpMessageConversionException ex) {
        // Log the exception
        ex.printStackTrace();

        // Return an appropriate error response
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error occurred: " + ex.getMessage());
    }
}
