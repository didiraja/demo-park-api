package com.mballem.demoparkapi.exception;

import lombok.Getter;

@Getter
public class ReciboCheckInNotFoundException extends RuntimeException {
    private final String recibo;

    public ReciboCheckInNotFoundException(String recibo) {
        this.recibo = recibo;
    }
}
