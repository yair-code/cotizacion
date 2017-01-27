package com.cotizador.services;

import com.cotizador.exceptions.NotAuthorizedProcessException;
import com.cotizador.services.interfaces.ICotizacion;
import com.cotizador.services.interfaces.ICotizacionManager;
import com.cotizador.utils.Moneda;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yairlisa on 1/27/17.
 */
public class CotizacionManager implements ICotizacionManager {

    private Map<Moneda, ICotizacion> estrategiasMoneda;

    CotizacionManager() {
        this. estrategiasMoneda = new HashMap<Moneda, ICotizacion>();
        estrategiasMoneda.put(Moneda.DOLAR, new CotizacionDolar());
        estrategiasMoneda.put(Moneda.PESOS, new CotizacionPesos());
        estrategiasMoneda.put(Moneda.REAL, new CotizacionReal());

    }

    @Override
    public String getCotizacionMoneda(String moneda) throws NotAuthorizedProcessException {
       Moneda moneda = new Moneda(moneda);
       ICotizacion cotizacion = estrategiasMoneda.get(moneda);
       return cotizacion.getCotizacion(moneda.getMoneda());

    }
}
