package com.cotizador.services;

import com.cotizador.exceptions.NotAuthorizedProcessException;
import com.cotizador.services.interfaces.ICotizacion;
import com.cotizador.services.interfaces.ICotizacionManager;
import com.cotizador.utils.Moneda;
import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yairlisa on 1/27/17.
 */
@Service
public class CotizacionManager implements ICotizacionManager {

    private EnumMap<Moneda, ICotizacion> estrategiasMoneda;

     CotizacionManager() {
        this. estrategiasMoneda = new EnumMap<Moneda, ICotizacion>(Moneda.class);
        estrategiasMoneda.put(Moneda.DOLAR, new CotizacionDolar());
        estrategiasMoneda.put(Moneda.PESOS, new CotizacionPesos());
        estrategiasMoneda.put(Moneda.REAL, new CotizacionReal());

    }

    @Override
    public String getCotizacionMoneda(String moneda) throws NotAuthorizedProcessException {
       Moneda monedaFromEnum = Moneda.valueOf(moneda.toUpperCase());
       ICotizacion cotizacion = estrategiasMoneda.get(monedaFromEnum);
       return cotizacion.getCotizacion(monedaFromEnum.getMoneda());

    }
}
