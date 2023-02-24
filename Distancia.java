package andres.marulanda.javaparanovatoscap2;
/**
 * @author Andres-Marulanda
 */
public class Distancia {
    
    // Atributos
    
    // Constructor que me permita invocar los métodos de la clase.
    
    public Distancia() {
        
    }
    
    // set y get.
    
    // Métodos.
    
    public double millasAMetros (double distancia){
        
        double metros = 0.0;
        
        metros = distancia * 1609.34;
        
        return metros;
    }
    
    public double millasAKilometros (double distancia){
        
        double kilometros = 0.0;
        
        kilometros = distancia  * 1.60934;
        
        return kilometros;
    }
    
}
