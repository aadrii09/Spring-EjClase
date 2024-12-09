INSERT INTO alumnos (id, nombre, edad, dni) VALUES (1, 'Juan Pérez', 30, '12345678A');
INSERT INTO alumnos (id, nombre, edad, dni) VALUES (2, 'María López', 25, '23456789B');
INSERT INTO alumnos (id, nombre, edad, dni) VALUES (3, 'Carlos García', 40, '34567890C');
INSERT INTO alumnos (id, nombre, edad, dni) VALUES (4, 'Ana Fernández', 22, '45678901D');

INSERT INTO asignaturas (id, nombre, horas) VALUES (1, 'Matemáticas', '2024-01-01');
INSERT INTO asignaturas (id, nombre, horas) VALUES (2, 'Historia', '2024-01-02');
INSERT INTO asignaturas (id, nombre, horas) VALUES (3, 'Física', '2024-01-03');
INSERT INTO asignaturas (id, nombre, horas) VALUES (4, 'Química', '2024-01-04');
INSERT INTO asignaturas (id, nombre, horas) VALUES (5, 'Literatura', '2024-01-05');

INSERT INTO alumnoasignatura (alumno_id, asignatura_id) VALUES (1, 1); -- Juan Pérez cursa Matemáticas
INSERT INTO alumnoasignatura (alumno_id, asignatura_id) VALUES (1, 3); -- Juan Pérez cursa Física

INSERT INTO alumnoasignatura (alumno_id, asignatura_id) VALUES (2, 2); -- María López cursa Historia
INSERT INTO alumnoasignatura (alumno_id, asignatura_id) VALUES (2, 4); -- María López cursa Química

INSERT INTO alumnoasignatura (alumno_id, asignatura_id) VALUES (3, 1); -- Carlos García cursa Matemáticas
INSERT INTO alumnoasignatura (alumno_id, asignatura_id) VALUES (3, 5); -- Carlos García cursa Literatura

INSERT INTO alumnoasignatura (alumno_id, asignatura_id) VALUES (4, 3); -- Ana Fernández cursa Física
INSERT INTO alumnoasignatura (alumno_id, asignatura_id) VALUES (4, 5); -- Ana Fernández cursa Literatura