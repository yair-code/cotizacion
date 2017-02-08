package com.cotizador.persistence.daos;

import com.cotizador.persistence.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by yairlisa on 2/7/17.
 */
public interface IUserDAO extends CrudRepository<User, Integer> {


}
