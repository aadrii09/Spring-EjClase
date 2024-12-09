package clase.model.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Asignatura {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 55, nullable = false)
    private String nombre;
    @Column(length = 55, nullable = false)
    private LocalDate horas;
    
    public Asignatura() {
    }

    public Asignatura(String nombre, LocalDate horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    public Asignatura(Integer id, String nombre, LocalDate horas) {
        this.id = id;
        this.nombre = nombre;
        this.horas = horas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getHoras() {
        return horas;
    }

    public void setHoras(LocalDate horas) {
        this.horas = horas;
    }

    

    
}