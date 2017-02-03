package com.cotizador.utils;

/**
 * Created by yairlisa on 1/27/17.
 */
public enum Moneda {
    PESOS ("pesos"),
    DOLAR ("dolar"),
    REAL  ("real");

    private final String moneda;

    Moneda(String moneda) {
        this.moneda = moneda.toLowerCase();
    }

    public String getMoneda() {
        return moneda;
    }
}
