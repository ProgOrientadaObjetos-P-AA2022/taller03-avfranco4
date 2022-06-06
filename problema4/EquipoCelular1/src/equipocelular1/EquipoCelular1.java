package equipocelular1;

public class EquipoCelular1 {
    private String sistemaOperativo;
    private String tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionImei;
    //Establecer
    public void establecerSistemaOperativo(String eqc){
        sistemaOperativo = eqc;
    }
    public void establecerTamanoPantalla(String eqc){
        tamanoPantalla = eqc;
    }
    public void establecerCostoInicial(double eqc){
        costoInicial = eqc;
    }
    public void establecerIvaPorcentaje(double eqc){
        ivaPorcentaje = eqc;
    }
    public void establecerIvaCostoInicial(double eqc){
        ivaCostoInicial = eqc;
    }
    public void establecerCostoFinal(double eqc){
        costoFinal = eqc;
    }
    public void establecerDireccionMac(String eqc){
        direccionMac = eqc;
    }
    public void establecerInformacionImeil(String eqc){
        informacionImei = eqc;
    }
    //Calcular
     public void calcularIvaCostoInicial() {
        ivaCostoInicial = costoInicial * (ivaPorcentaje / 100);
    }

    public void calcularCostoFinal() {
        costoFinal = ivaCostoInicial + costoInicial;
    }
    //obtener
    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }
    
    public String obtenerTamanoPantalla() {
        return tamanoPantalla;
    }
    
    public double obtenerCostoInicial() {
        return costoInicial;
    }
    
    public double obtenerIvaPorcentaje() {
        return ivaPorcentaje;
    }
    
    public double obtenerIvaCostoInicial() {
        return ivaCostoInicial;
    }
    
    public double obtenerCostoFinal() {
        return costoFinal;
    }
    
    public String obtenerDireccionMac() {
        return direccionMac;
    }
    
    public String obtenerInformacionImei() {
        return informacionImei;
    }
}
