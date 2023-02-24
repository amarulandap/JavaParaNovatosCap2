package andres.marulanda.javaparanovatoscap2;
/**
 * @author Andres-Marulanda
 */
public class ConversorDivisas {
    
    // Convierta pesos en dolares y viceversa.
    
    // Atributos 
    
    private double tipoDeCambio;  // Valor constante al dolar.
    
    // Constructores

    public ConversorDivisas() {     // Me permite tener una tasa de cambio fija.
        this.TipoDeCambioFijo();
    }

    public ConversorDivisas(double tipoDeCambio) {     // Le permite al usuario ingresar la tasa de cambio.
        this.tipoDeCambio = tipoDeCambio;
    }

    // set y get
    
    public double getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(double tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }
    
    // Métodos.
    
    public double TipoDeCambioFijo (){     // Asignarle un valor fijo a la tasa de cambio.
        
        // this.tipoDeCambio = 4000;
        
        // return this.tipoDeCambio; 
        
        this.setTipoDeCambio(4000);
        this.tipoDeCambio = this.getTipoDeCambio();
        
        return this.tipoDeCambio;
    }
    
    public double PesosADolares (double divisa){    // Convertir pesos en dolares.
    
        double pesos = divisa;
        double dolares = 0.0;
        
        dolares = pesos / this.getTipoDeCambio();
        
        return dolares;
    }
    
    public double DolaresAPesos (double divisa){       // Convertir dolares a pesos.
    
        double pesos = 0.0;
        double dolares = divisa;
        
        pesos = dolares * this.getTipoDeCambio();
        
        return pesos;
    }

}