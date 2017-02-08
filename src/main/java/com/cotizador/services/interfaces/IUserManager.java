package com.cotizador.services.interfaces;

import com.cotizador.services.dtos.UserDTO;

import java.util.List;

/**
 * Created by yairlisa on 2/7/17.
 */
public interface IUserManager {

    List<UserDTO> getUsers();
}
