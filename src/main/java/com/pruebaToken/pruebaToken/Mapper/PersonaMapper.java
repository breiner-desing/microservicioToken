
package com.pruebaToken.pruebaToken.Mapper;

import com.pruebaToken.pruebaToken.Dto.PersonaDTO;
import com.pruebaToken.pruebaToken.modelo.Persona;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface PersonaMapper {
    
    public Persona personaDTOToPersona (PersonaDTO persona);
    public PersonaDTO personaToPersonaDTO ( Persona persona );
    public List<Persona> ListPersonaDTOToListPersona(List<PersonaDTO> listaPersona);
    public List<PersonaDTO> ListPersonaToListPersonaDTO(List<Persona> listaPersona);
    
}
