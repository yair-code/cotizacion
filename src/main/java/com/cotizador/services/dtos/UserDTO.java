package com.cotizador.services.dtos;

import com.cotizador.persistence.entities.User;

/**
 * Created by yairlisa on 2/7/17.
 */
public class UserDTO {

    private int dni;
    private String nombre;
    private String apellido;
    private String email;

    private String password;

    public UserDTO(int dni, String nombre, String apellido, String email, String password) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static UserDTO convertFromUser(User user) {
        UserDTO userDTO = new UserDTO(user.getDni(), user.getNombre(), user.getApellido(),
                                      user.getEmail(), user.getPassword());
        return userDTO;
    }
}
