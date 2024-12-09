package clase.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import clase.model.entities.Alumno;

public interface IAlumnoRepository extends JpaRepository <Alumno, Integer> {

}
