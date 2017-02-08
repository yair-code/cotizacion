package com.cotizador;

import com.cotizador.exceptions.NotAuthorizedProcessException;
import com.cotizador.services.interfaces.ICotizacionManager;
import com.cotizador.utils.Moneda;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by yairlisa on 2/7/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CotizacionManagerTest {

    @Autowired
    private ICotizacionManager cotizacionManager;

    @Test(expected = NotAuthorizedProcessException.class)
    public void getCotizacionPesosWithExceptionTest() {
      //  String cotizacion = cotizacionManager.getCotizacionMoneda(Moneda.PESOS.getMoneda());

    }
}
