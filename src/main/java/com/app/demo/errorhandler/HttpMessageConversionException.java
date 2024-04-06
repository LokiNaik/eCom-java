package com.app.demo.errorhandler;

public class HttpMessageConversionException extends RuntimeException{

    public HttpMessageConversionException(String message, Throwable cause){
        super(message, cause);
    }
}
