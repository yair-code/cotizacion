package com.cotizador.services;

import com.cotizador.exceptions.NotAuthorizedProcessException;
import com.cotizador.services.interfaces.ICotizacion;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * Created by yairlisa on 1/26/17.
 */
public class CotizacionDolar implements ICotizacion {

    @Autowired
    private Environment env;

    @Override
    public String getCotizacion(String moneda) throws NotAuthorizedProcessException {
        String valorMoneda = consultarAPIBancoProvincia();
        return valorMoneda;
    }

    public String consultarAPIBancoProvincia() {
        RestTemplate restTemplate = new RestTemplate();
        String cotizactionResourceUrl = "https://www.bancoprovincia.com.ar/Principal/Dolar";
        String response = restTemplate.getForObject(cotizactionResourceUrl, String.class);

        String cotizacionActual = response.substring(1, response.length()-1);

        return cotizacionActual;
    }
}

