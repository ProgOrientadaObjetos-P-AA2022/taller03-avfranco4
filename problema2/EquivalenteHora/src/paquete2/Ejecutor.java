
package paquete2;

import equivalentehora.EquivalenteHora;
public class Ejecutor {
    public static void main(String[] args) {
        // Objetos
        EquivalenteHora horas0  = new EquivalenteHora();
        EquivalenteHora horas1 = new EquivalenteHora();
        //Variables
        double horaUno = 35;
        double horaDos = 50.35;
        //Establecer
        horas0.establecerHoras(horaUno);
        horas1.establecerHoras(horaDos);
        //Calcular
        horas0.establecerMinutos();
        horas0.establecerSegundos();
        horas0.establecerDias();
        
        horas1.establecerMinutos();
        horas1.establecerSegundos();
        horas1.establecerDias();
        //Obtener
        System.out.printf("Equivalente a Horas\n\nHoras: %.2f\n"
                + "Minutos: %.2f\nSegundos: %.2f\nDias: %.2f\n\nHoras: %.2f\n"
                + "Minutos: %.2f\nSegundos: %.2f\nDias: %.2f\n"
                ,horas0.obtenerHoras()
                ,horas0.obtenerMinutos()
                ,horas0.obtenerSegundos()
                ,horas0.obtenerDias()
                ,horas1.obtenerHoras()
                ,horas1.obtenerMinutos()
                ,horas1.obtenerSegundos()
                ,horas1.obtenerDias());
    
    }
}
