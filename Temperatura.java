package andres.marulanda.javaparanovatoscap2;
/**
 * @author Andres-Marulanda
 */
public class Temperatura {
    
    // Atributos.
    
    // Constructor vacio que me permita invocar los dos métodos para la conversión de la temperatura.
    
    public Temperatura() {
        
    }
    
    // No necesitamos los set y los get dado que no tenemos atributos.
    
    // Crear los métodos para convertir la temperatura.
    
    public double CtoF (double temp){
        
        double celsius = temp;
        double farenheit = 0.0;
        
        farenheit = 1.8 * celsius + 32;
        
        return farenheit;
        
    }
    
    public double FtoC (double temp){
        
        double celsius = 0.0;
        double farenheit = temp;
        
        celsius = (farenheit - 32) / 1.8;
        
        return celsius;
    }
    
}
