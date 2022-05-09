
package com.pruebaToken.pruebaToken.Dto;

import lombok.Data;

public class UserDTO {
    
    private String user;
    private String token;
    private String rol;

    public UserDTO(String user, String token, String rol) {
        this.user = user;
        this.token = token;
        this.rol = rol;
    }

    public UserDTO() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
