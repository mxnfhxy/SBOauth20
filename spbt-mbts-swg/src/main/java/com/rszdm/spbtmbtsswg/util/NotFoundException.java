package com.rszdm.spbtmbtsswg.util;

public class NotFoundException extends GlobalException {
    public NotFoundException(String message, int code){
        super(message, code);
    }
}