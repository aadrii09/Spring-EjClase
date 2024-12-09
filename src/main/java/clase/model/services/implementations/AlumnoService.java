package clase.model.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clase.model.entities.Alumno;
import clase.model.repositories.IAlumnoRepository;
import clase.model.services.interfaces.IAlumnoService;

@Service
public class AlumnoService implements IAlumnoService {
    //primer paso: hago autowired y llamo al repository y le doy un nombre
    @Autowired
    IAlumnoRepository alumnoRepo;
    @Override
    public List<Alumno> listaAlumnos() {
        //segundo paso: aqui le digo lo que tiene q buscar
        return alumnoRepo.findAll();
        
    }
    
    
}
