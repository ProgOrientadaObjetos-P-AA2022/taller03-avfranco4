
package terreno1;


public class Terreno1 {

     
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    public void establecerAncho(double c){
        ancho = c;
    }
    
    public void establecerLargo(double c){
        largo = c;
    }
    public void establecerValorMetroCuadrado(double c){
        valorMetroCuadrado = c ;
    }
    public void calcularArea(){
        area = ancho * largo;
    }
    public void calcularCostoTerreno(){
         costo_terreno = area * valorMetroCuadrado;
    }
    //obtener
    public double obtenerCostoTerreno(){
        return  costo_terreno;
    }
    public double obtenerAncho(){
        return  ancho;
    }
    public double obtenerLargo(){
        return  largo;
    }
    public double obtenerArea(){
        return  area;
    }
    public double obtenerValorMetroCuadrado(){
        return  valorMetroCuadrado;
    }

   
}
    
   
    
    

