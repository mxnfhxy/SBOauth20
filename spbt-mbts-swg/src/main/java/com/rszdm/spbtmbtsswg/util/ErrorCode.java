package com.rszdm.spbtmbtsswg.util;

public enum ErrorCode {

    USER_NOT_FOUND(40401),
    USER_ALREADY_EXIST(40001),
    DUPLICATE_PRI_INTERNAL_SERVER_ERROR(50001),
    ;
    private int code;

    public int getCode() {
        return code;
    }

    ErrorCode(int code){
        this.code = code;
    }
}

