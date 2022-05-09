
package com.pruebaToken.pruebaToken.Repository;

import com.pruebaToken.pruebaToken.Dto.UserDTO;
import com.pruebaToken.pruebaToken.Dto.loginDTO;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Log4j2
@Repository
public class SeguridadRepositoryV {
    
    @Autowired
    private JdbcTemplate jdbcTransacciones;
    
    public UserDTO obtenerRangos( loginDTO user ) {

        try {
            MapSqlParameterSource parametros = new MapSqlParameterSource ();

            String sql = "select l.user, l.rol, l.token from login l where l.user = :user and l.password = :password ";
            
            parametros.addValue("user", user.getUsername());
            parametros.addValue("password", user.getPassword());
            
            NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(this.jdbcTransacciones);
            List<UserDTO> query = namedTemplate.query(sql, parametros, new BeanPropertyRowMapper<>(UserDTO.class));
            
            UserDTO get = query.get(0);
            
            return get;

        } catch (Exception ce) {
            System.out.println("exepcion");
            return null;
        } 
    }
    
}
