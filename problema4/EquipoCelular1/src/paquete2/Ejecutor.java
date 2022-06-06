
package paquete2;
import equipocelular1.EquipoCelular1;
public class Ejecutor {
    public static void main(String[] args) {
        // Objetos
        EquipoCelular1 eqc = new EquipoCelular1();
        EquipoCelular1 eqc1 = new EquipoCelular1();
        // Variables
        String sistemaOperativo = "Iphone";
        String tamaPantalla = "17cm";
        double costoInicial1 = 950;
        double ivaPorcentaje1 = 20;
        String direccionMac1 = "1.0.123.4562";
        String informacionImei1 = "0.001.be.0e0";

        String sistemaOperativo1 = "Xiami";
        String tamaPantalla1 = "22cm";
        double costoInicial2 = 700;
        double ivaPorcentaje2 = 11;
        String direccionMac2 = "1.0.110.4862";
        String informacionImei2 = "0.035.01.0e0";
        // Metodos
        eqc.establecerSistemaOperativo(sistemaOperativo);
        eqc.establecerTamanoPantalla(tamaPantalla);
        eqc.establecerCostoInicial(costoInicial1);
        eqc.establecerIvaPorcentaje(ivaPorcentaje1);
        eqc.establecerDireccionMac(direccionMac1);
        eqc.establecerInformacionImeil(informacionImei1);
        
        eqc1.establecerSistemaOperativo(sistemaOperativo1);
        eqc1.establecerTamanoPantalla(tamaPantalla1);
        eqc1.establecerCostoInicial(costoInicial2);
        eqc1.establecerIvaPorcentaje(ivaPorcentaje2);
        eqc1.establecerDireccionMac(direccionMac2);
        eqc1.establecerInformacionImeil(informacionImei2);
        //Calcular
        eqc.calcularIvaCostoInicial();
        eqc.calcularCostoFinal();
        eqc1.calcularIvaCostoInicial();
        eqc1.calcularCostoFinal();
        //Obtener
        System.out.printf("Equipos Celulares\n\nEquipo Celular 1\n"
                + "Sistema Operativo: %s\nPantalla: %s\nCosto Inicial: %.2f\n"
                + "Porcentaje IVA: %.1f\nIVA Resultante: %.2f\nDirección Mac: "
                + "%s\nInformación IMEI: %s\nCosto Final: %.2f\n"
                , eqc.obtenerSistemaOperativo()
                , eqc.obtenerTamanoPantalla()
                , eqc.obtenerCostoInicial()
                , eqc.obtenerIvaPorcentaje()
                , eqc.obtenerIvaCostoInicial()
                , eqc.obtenerDireccionMac()
                , eqc.obtenerInformacionImei()
                , eqc.obtenerCostoFinal());
        System.out.printf("\nEquipo Celular 2\n"
                + "Sistema Operativo: %s\nPantalla: %s\nCosto Inicial: %.2f\n"
                + "Porcentaje IVA: %.1f\nIVA Resultante: %.2f\nDirección Mac: "
                + "%s\nInformación IMEI: %s\nCosto Final: %.2f\n"
                , eqc1.obtenerSistemaOperativo()
                , eqc1.obtenerTamanoPantalla()
                , eqc1.obtenerCostoInicial()
                , eqc1.obtenerIvaPorcentaje()
                , eqc1.obtenerIvaCostoInicial()
                , eqc1.obtenerDireccionMac()
                , eqc1.obtenerInformacionImei()
                , eqc1.obtenerCostoFinal());
    }
    
}
