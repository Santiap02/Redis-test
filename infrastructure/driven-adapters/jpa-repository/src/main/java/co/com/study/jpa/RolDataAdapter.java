package co.com.study.jpa;

import co.com.study.jpa.helper.AdapterOperations;
import co.com.study.model.rol.Rol;
import co.com.study.model.rol.gateways.RolRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RolDataAdapter extends AdapterOperations<Rol, RolData, Long, RolDataRepository>
 implements RolRepository
{

    public RolDataAdapter(RolDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Rol.class));
    }
}
