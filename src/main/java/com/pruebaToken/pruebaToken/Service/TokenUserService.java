/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pruebaToken.pruebaToken.Service;

import com.pruebaToken.pruebaToken.Dto.UserDTO;
import com.pruebaToken.pruebaToken.Dto.loginDTO;

public interface TokenUserService {
    
    public UserDTO login (loginDTO user);
    
}
