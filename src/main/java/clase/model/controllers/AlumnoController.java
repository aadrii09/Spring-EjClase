package clase.model.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import clase.model.entities.Alumno;
import clase.model.services.implementations.AlumnoService;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;
    //esto es el nombre del epoint
    @GetMapping("/buscarAlumnos")
    public List<Alumno> buscarAlumnos(){
        return alumnoService.listaAlumnos();
    }
}
