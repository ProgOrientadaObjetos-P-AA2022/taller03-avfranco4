
package institucioneseducativas;


public class InstitucionesEducativas {
    //Atributos
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosPresuEstu;
    private double presupuesto;
    //Establecer
   public void establecerNombre(String edu) {
        nombre = edu;
    }
   public void establecerTipoIntitucion(String edu){
       tipoInstitucion = edu;
   }
   public void establecerNumeroAlumnos(int edu){
       numeroAlumnos = edu;
   }
   public void establecerNumeroDocentes(int edu){
       numeroDocentes = edu;
   }
   public void establecerNumeroSedes(int edu){
       numeroSedes = edu;
   }
   public void establecerGastosPresuEstu(double edu){
       gastosPresuEstu = edu;
   }
   //Cálcular
   
   public void calcularPresupuesto(){
       presupuesto = numeroAlumnos * gastosPresuEstu;
   }
   //Obtener
   
   public String obtenerNombre(){
       return nombre;
   }
   public String obtenerTipoInstitucion(){
       return tipoInstitucion;
   }
   public int obtenerNumumeroAlumnos(){
       return numeroAlumnos;
   }
   public int obtenerNumeroDocentes(){
       return numeroDocentes;
   }
   public int obtenerNumeroSedes(){
       return numeroSedes;
   }
   public double obtenerGastosPresuEstu(){
       return gastosPresuEstu;
   }
   public double obtenerPresupuesto(){
       return presupuesto;
   }
    
}
