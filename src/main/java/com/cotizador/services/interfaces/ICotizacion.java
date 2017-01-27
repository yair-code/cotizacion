package com.cotizador.services.interfaces;

import com.cotizador.exceptions.NotAuthorizedProcessException;

/**
 * Created by yairlisa on 1/26/17.
 */
public interface ICotizacion {

    public String getCotizacion(String moneda) throws NotAuthorizedProcessException;
}
