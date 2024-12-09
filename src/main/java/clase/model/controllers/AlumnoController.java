package clase.model.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import clase.model.entities.Alumno;
import clase.model.services.implementations.AlumnoService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;
    //esto es el nombre del epoint
    @GetMapping("/buscar_alumnos")
    public List<Alumno> buscarAlumnos(){
        return alumnoService.listaAlumnos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumno> buscarId(@PathVariable Integer id) {
        try {
            Alumno alumno = alumnoService.buscarId(id);
            if (alumno!= null) {
                return ResponseEntity.ok().body(alumno);
            }else{
                return ResponseEntity.badRequest().build();
            }
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
    
}