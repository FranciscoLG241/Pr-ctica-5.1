# Práctica-5.1
1.Interpreta el significado del diagrama de clases.

a) Relación entre las clases. Significado, tipo, multiplicidad. 
- El diagrama muestra que un Curso tiene muchos Estudiantes. Esta es una relación de composición, lo que significa que los estudiantes existen 
como parte del curso. La multiplicidad es 1:N, porque un curso puede tener muchos estudiantes, pero un estudiante solo pertenece a un curso.



b) Elementos de las clases. Tipos y propósito. 

Clase CURSO:
  Atributos:
    nombre y codigo son cadenas de texto que identifican el curso.
    estudiantes es una lista que guarda a los estudiantes inscritos.
  Métodos:
    agregarAlumno(): Añade un estudiante a la lista.
    mostrarEstudiantes(): Muestra los nombres y DNIs de los estudiantes.

    
Clase ESTUDIANTE:
  Atributos:
    nombre y dni son cadenas que identifican al estudiante.
  Método:
    inscribirse(): Permite que el estudiante se inscriba en un curso.



c)Significado del método agregarAlumno(). Funcionamiento. 
- El método agregarAlumno() se usa para registrar un estudiante en el curso. Recibe un estudiante como parámetro y lo añade a la lista 
de estudiantes.


d) Significado del método inscribirse()
- El método inscribirse() está en la clase Estudiante y sirve para que el estudiante se inscriba en un curso. Llama al método 
agregarAlumno() del curso para que lo añada a su lista.






