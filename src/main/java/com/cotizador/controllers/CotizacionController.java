package com.cotizador.controllers;

import com.cotizador.exceptions.NotAuthorizedProcessException;
import com.cotizador.services.interfaces.ICotizacionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yairlisa on 1/26/17.
 */
@RestController
@RequestMapping("/Cotizacion")
public class CotizacionController {

    @Autowired
    private ICotizacionManager cotizacionManager;

    @RequestMapping(value = "/{moneda}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getCotization(@PathVariable String moneda) {
        try {
            String cotizacion = cotizacionManager.getCotizacionMoneda(moneda);
            return new ResponseEntity<String>(cotizacion, HttpStatus.OK);
        } catch(NotAuthorizedProcessException e) {
            return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED);
        }
    }

}
