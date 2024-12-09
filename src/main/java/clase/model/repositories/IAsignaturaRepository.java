package clase.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import clase.model.entities.Asignatura;

public interface IAsignaturaRepository extends JpaRepository<Asignatura, Integer> {

}
