package com.cotizador.controllers;

import com.cotizador.services.dtos.UserDTO;
import com.cotizador.services.interfaces.IUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yairlisa on 2/7/17.
 */
@RestController
public class UsuarioController {

    @Autowired
    private IUserManager userManager;

    @RequestMapping(value = "/Usuarios", method = RequestMethod.GET)
    public List<UserDTO> getUsuarios() {
        return userManager.getUsers();
    }
}
