package com.cotizador.services;

import com.cotizador.exceptions.NotAuthorizedProcessException;
import com.cotizador.services.interfaces.ICotizacion;

/**
 * Created by yairlisa on 1/26/17.
 */
public class CotizacionPesos implements ICotizacion {

    @Override
    public String getCotizacion(String moneda) throws NotAuthorizedProcessException {
        throw new NotAuthorizedProcessException();
    }
}
