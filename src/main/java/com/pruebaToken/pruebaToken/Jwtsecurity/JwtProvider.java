/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaToken.pruebaToken.Jwtsecurity;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider {
    
//    @Value("${jwt.token.secret-key}")
//    private String secretKey;
//
//    @Value("${jwt.token.expire-length-minutos}")
//    private Integer tokenValidityInMinutes;
    
    public String getJWTToken(String username, String rol) {
        
        
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
              .commaSeparatedStringToAuthorityList(rol);
        String token = Jwts
                        .builder()
                        .setId("softtekJWT")
                        .setSubject(username)
                        .claim("authorities",grantedAuthorities.stream()
                                                        .map(GrantedAuthority::getAuthority)
                                                        .collect(Collectors.toList()))
                        .setIssuedAt(new Date(System.currentTimeMillis()))
                        .setExpiration(new Date(System.currentTimeMillis() + 600000))
                        .signWith(SignatureAlgorithm.HS512,
                                        secretKey.getBytes()).compact();
        return "Bearer " + token;
    }
    
}
