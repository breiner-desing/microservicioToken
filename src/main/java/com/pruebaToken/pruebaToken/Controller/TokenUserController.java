/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaToken.pruebaToken.Controller;

import com.pruebaToken.pruebaToken.Dto.UserAutenticarDTO;
import com.pruebaToken.pruebaToken.Dto.UserDTO;
import com.pruebaToken.pruebaToken.Dto.loginDTO;
import com.pruebaToken.pruebaToken.Service.TokenUserService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@CrossOrigin("*")
@RequestMapping("jwt")
public class TokenUserController {
    
    @Autowired
    private TokenUserService tokenUserService;
    
    @PostMapping("token")
    public ResponseEntity<UserDTO>  token( @RequestBody loginDTO user ) {    
        UserDTO login = tokenUserService.login(user);
         return ResponseEntity.ok(login);
    }

}
