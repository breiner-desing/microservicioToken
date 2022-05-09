
package com.pruebaToken.pruebaToken.Mapper;

import com.pruebaToken.pruebaToken.Dto.MascotaDTO;
import com.pruebaToken.pruebaToken.modelo.Mascota;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface MascotaMapper {

    public MascotaDTO mascotaToMascotaDTO( Mascota mascota);
    public Mascota mascotaDTOTomascota ( MascotaDTO mascota);
    public List<MascotaDTO> ListmascotaToListMascotaDTO( List<Mascota> Listmascota );
    public List<Mascota> ListMascotaDTOToListMascota( List<MascotaDTO> Listmascota );
    
}
