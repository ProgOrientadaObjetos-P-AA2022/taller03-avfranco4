
package paquete2;
import institucioneseducativas.InstitucionesEducativas;
public class Ejecutor {
    public static void main(String[] args) {
        //objetos
        InstitucionesEducativas entidad1 = new InstitucionesEducativas();
        //Variables
        String nombre = "Mons Luis Alfonso";
        String tipoInstitucion = "Fiscomisional";
        int numeroEstudiantes = 1600;
        int numeroDocentes = 40;
        int numeroSedes = 1;
        double gastosPresuEstu = 30;

        entidad1.establecerNombre(nombre);
        entidad1.establecerTipoIntitucion(tipoInstitucion);
        entidad1.establecerNumeroAlumnos(numeroEstudiantes);
        entidad1.establecerNumeroDocentes(numeroDocentes);
        entidad1.establecerNumeroSedes(numeroSedes);
        entidad1.establecerGastosPresuEstu(gastosPresuEstu);
        entidad1.calcularPresupuesto();

        //Datos
        System.out.printf("Institución Educativa 1\nNombre: %s\nTipo de Institución: %s\n"
                + "Número de Estudiantes: %d\nNúmero de Docentes: %d\nNúmero de Sedes: %d\n"
                + "Gastos Proyectado por Estudiante: %.2f\n\tPresupuesto: %.2f\n",
                entidad1.obtenerNombre(),
                entidad1.obtenerTipoInstitucion(),
                entidad1.obtenerNumumeroAlumnos(),
                entidad1.obtenerNumeroDocentes(),
                entidad1.obtenerNumeroSedes(),
                entidad1.obtenerGastosPresuEstu(),
                entidad1.obtenerPresupuesto());
        
        System.out.println("========================================");
        System.out.println("^       ^         ^         ^          ^");
        System.out.println("|       |         |         |          |");
        System.out.println("========================================");
       //objeto2        
        InstitucionesEducativas entidad2 = new InstitucionesEducativas();
        //Variables
        String nombre2 = "Garcia Moreno";
        String tipoInstitucion2 = "Privada";
        int numeroAlumnos2 = 1300;
        int numeroDocentes2 = 30;
        int numeroSedes2 = 2;
        double gastosPresuEstu2 = 120.35;
        //Establecer
        entidad2.establecerNombre(nombre2);
        entidad2.establecerTipoIntitucion(tipoInstitucion2);
        entidad2.establecerNumeroAlumnos(numeroAlumnos2);
        entidad2.establecerNumeroDocentes(numeroDocentes2);
        entidad2.establecerNumeroSedes(numeroSedes2);
        entidad2.establecerGastosPresuEstu(gastosPresuEstu2);
        entidad2.calcularPresupuesto();

        //Datos
        System.out.printf("\n\tInstitución Educativa 2\nNombre: %s\nTipo de Institución: %s\n"
                + "Número de Estudiantes: %d\nNúmero de Docentes: %d\nNúmero de Sedes: %d\n"
                + "Gastos Proyectado por Estudiante: %.2f\n\tPresupuesto: %.2f\n",
                //Obtener
                entidad2.obtenerNombre(),
                entidad2.obtenerTipoInstitucion(),
                entidad2.obtenerNumumeroAlumnos(),
                entidad2.obtenerNumeroDocentes(),
                entidad2.obtenerNumeroSedes(),
                entidad2.obtenerGastosPresuEstu(),
                entidad2.obtenerPresupuesto());
  
    }
}
