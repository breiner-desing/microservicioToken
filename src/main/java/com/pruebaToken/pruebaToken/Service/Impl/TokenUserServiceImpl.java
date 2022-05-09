/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaToken.pruebaToken.Service.Impl;

import com.pruebaToken.pruebaToken.Dto.UserDTO;
import com.pruebaToken.pruebaToken.Dto.loginDTO;
import com.pruebaToken.pruebaToken.Jwtsecurity.JwtProvider;
import com.pruebaToken.pruebaToken.Repository.SeguridadRepositoryV;
import com.pruebaToken.pruebaToken.Service.TokenUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenUserServiceImpl implements TokenUserService{
    
    @Autowired
    private SeguridadRepositoryV seguridadRepository;
    
    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public UserDTO login(loginDTO user) {

        UserDTO userAutenticarByUserAutenticar = seguridadRepository.obtenerRangos( user );

        String tokenizacion = tokenizacion(userAutenticarByUserAutenticar);
        
        UserDTO userDTO = new UserDTO();
        
        userDTO.setUser(userAutenticarByUserAutenticar.getUser());
        userDTO.setRol(userAutenticarByUserAutenticar.getRol());
        userDTO.setToken(tokenizacion);
        
        return userDTO;
//        return null;
    }
    
    public String tokenizacion(UserDTO user){
        
        String jwtToken = jwtProvider.getJWTToken(user.getUser(), user.getRol());
        
        return jwtToken;
    }
    
}
