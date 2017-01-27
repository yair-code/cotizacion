package com.cotizador.services.interfaces;

import com.cotizador.exceptions.NotAuthorizedProcessException;

/**
 * Created by yairlisa on 1/27/17.
 */
public interface ICotizacionManager {

    public String getCotizacionMoneda(String moneda) throws NotAuthorizedProcessException;
}
