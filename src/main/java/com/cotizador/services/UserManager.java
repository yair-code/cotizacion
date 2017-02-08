package com.cotizador.services;

import com.cotizador.persistence.daos.IUserDAO;
import com.cotizador.persistence.entities.User;
import com.cotizador.services.dtos.UserDTO;
import com.cotizador.services.interfaces.IUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yairlisa on 2/7/17.
 */
@Service
public class UserManager implements IUserManager {

    @Autowired
    private IUserDAO userDao;

    @Override
    public List<UserDTO> getUsers() {
        Iterable<User> userList = userDao.findAll();
        List<UserDTO> userDTOList = new ArrayList<UserDTO>();

        userList.forEach(user -> {
            userDTOList.add(UserDTO.convertFromUser(user));
        });

        return userDTOList;

    }
}
