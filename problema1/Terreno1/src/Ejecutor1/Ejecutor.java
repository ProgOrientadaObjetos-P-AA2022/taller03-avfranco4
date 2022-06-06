
package Ejecutor1;

import terreno1.Terreno1;

public class Ejecutor {
     public static void main(String[] args) {
        //objeto
        Terreno1 disp = new Terreno1();
        Terreno1 disp1 = new Terreno1();
        //variables de entrada
        double ancho = 200.57;
        double largo= 220.77;
        double valorMetroCuadrado = 10.50;
        
        double ancho1 = 150.54;
        double largo1=  125.71;
        double valorMetroCuadrado1 = 5.25;
        //Establecer
        disp.establecerAncho(ancho);
        disp.establecerLargo(largo);
        disp.establecerValorMetroCuadrado(valorMetroCuadrado);
        
        disp1.establecerAncho(ancho1);
        disp1.establecerLargo(largo1);
        disp1.establecerValorMetroCuadrado(valorMetroCuadrado1);
        //Calcular
        disp.calcularArea();
        disp.calcularCostoTerreno();
        
        disp1.calcularArea();
        disp1.calcularCostoTerreno();
        //Obtener
        System.out.printf("Costo del Terreno\n\nTerreno 1 \nAncho: %.2f\n"
                + "Largo: %.2f\nValor Metro Cuadrado: %.2f\n"
                + "Area: %.2f\nCosto del Terreno: %.2f\n\n"
                +"Terreno 2\nAncho: %.2f\nLargo: %.2f\n"
                +"Valor Metro Cuadrado: %.2f\n"
                + "Area: %.2f\nCosto del Terreno: %.2f\n",
                disp.obtenerAncho(),
                disp.obtenerLargo(),
                disp.obtenerValorMetroCuadrado(),
                disp.obtenerArea(),
                disp.obtenerCostoTerreno(),
                
                disp1.obtenerAncho(),
                disp1.obtenerLargo(),
                disp1.obtenerValorMetroCuadrado(),
                disp1.obtenerArea(),
                disp1.obtenerCostoTerreno());
                
        }                  
}
