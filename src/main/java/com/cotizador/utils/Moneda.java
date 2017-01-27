package com.cotizador.utils;

import org.hibernate.validator.internal.metadata.aggregated.rule.ReturnValueMayOnlyBeMarkedOnceAsCascadedPerHierarchyLine;

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
