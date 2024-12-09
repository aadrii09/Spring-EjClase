package clase.model.services.interfaces;

import java.util.List;

import clase.model.entities.Alumno;

public interface IAlumnoService {

    //esto es para que me devuelva una lista alumnos
    public List<Alumno> listaAlumnos(); 

    Alumno buscarId(Integer id);
    
}
