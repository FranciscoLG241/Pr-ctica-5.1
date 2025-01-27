


class Curso(
    val nombre: String,
    val codigo: String
) {
    private val estudiantes: MutableList<Estudiante> = mutableListOf()

    fun agregarAlumno(estudiante: Estudiante) {
        estudiantes.add(estudiante)
        println("${estudiante.nombre} ha sido agregado al curso $nombre.")
    }

    fun mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            println("No hay estudiantes inscritos en el curso $nombre.")
        } else {
            println("Estudiantes inscritos en el curso $nombre:")
            estudiantes.forEach { estudiante -> println("- ${estudiante.nombre} (DNI: ${estudiante.dni})") }
        }
    }
}

class Estudiante(
    val nombre: String,
    val dni: String
) {
    fun inscribirse(curso: Curso) {
        curso.agregarAlumno(this)
    }
}

fun main() {
    val cursoProgramacion = Curso("Entornos de Desarrollo", "KOT101")
    val estudiante1 = Estudiante("Fran Letrán", "12345678")
    val estudiante2 = Estudiante("María López", "87654321")

    estudiante1.inscribirse(cursoProgramacion)
    estudiante2.inscribirse(cursoProgramacion)

    cursoProgramacion.mostrarEstudiantes()
}
