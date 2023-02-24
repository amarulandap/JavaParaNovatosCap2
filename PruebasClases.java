package andres.marulanda.javaparanovatoscap2;
/**
 * @author Andres-Marulanda
 */

// Crear los métodos para poder probar las diferentes clases que creeemos.

import java.util.Scanner;

public class PruebasClases {
    
    static Scanner leer = new Scanner (System.in);

    public static void main(String[] args) {
        
        // invocar métodos.
        probarTemperatura();
        probarConversorDivisas();
       
    }
    
    public static void probarTemperatura (){
        
        byte opcion = 0;            // guardar la opción seleccionada por el usuario.
        double celsius = 0.0;       // guardar la temperatura en celsius.
        double farenheit = 0.0;     // guardar la temperatura en farenheit.
        Temperatura temperatura = new Temperatura (); // El objeto que me permite invocar los métodos de la clase.
        
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Celsius a Farenheit: ");
        System.out.println("2. Farenheit a Celsius: ");
        
        try {
                
                opcion = leer.nextByte(); // almacenamos el dato ingresado por el usuario.
                
            } catch (Exception e) {
                
                e.printStackTrace();      // Controlar que el usuario siempre ingrese un dato númerico.
                
            }
        
        if (opcion == 1){
                
            System.out.println("\nCelsius: ");
            celsius = leer.nextDouble();
            
            farenheit = temperatura.CtoF(celsius);
            
            System.out.println("\nFarenheit = " + farenheit + "°F");
        }
        
        else if (opcion == 2){
            
            System.out.println("\nFarenheit: ");
            farenheit = leer.nextDouble();
            
            celsius = temperatura.FtoC(farenheit);
            
            System.out.println("\nCelsius = " + celsius + "°C");   
        }
        
        else if (opcion != 1 && opcion != 2){
        
            System.out.println("\nOpción erronea");
        }
    }
    
    public static void probarConversorDivisas (){
        
        byte opcion = 0;            // guardar la opción seleccionada por el usuario.
        double pesos = 0.0;         // guardar la divisa en pesos.
        double dolares = 0.0;       // guardar la divisa en dólares.
        double tasa = 0.0;          // tasa de cambio variable.
        ConversorDivisas divisa = new ConversorDivisas (); // El objeto que me permite invocar los métodos de la clase.
        
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Pesos en Dólares con tipo de cambio fijo: ");
        System.out.println("2. Dólares en pesos con tipo de cambio fijo: ");
        System.out.println("3. Pesos en Dólares con tipo de cambio variable: ");
        System.out.println("4. Dólares en pesos con tipo de cambio variable: ");
        System.out.println("5. Consultar el tipo de cambio fijo: ");
        
        try {
                
                opcion = leer.nextByte(); // almacenamos el dato ingresado por el usuario.
                
            } catch (Exception e) {
                
                e.printStackTrace();      // Controlar que el usuario siempre ingrese un dato númerico.
                
            }
        
        if (opcion == 1 || opcion == 2){
            
            divisa.TipoDeCambioFijo();     // Le asigna a tipo de cambio el valor de 4000.
               
        } else if (opcion == 3 || opcion == 4){
            
            System.out.println("Ingrese la tasa de cambio en pesos: ");
            tasa = leer.nextDouble();
            divisa.setTipoDeCambio(tasa);   // Asignar la tasa de cambio variable.
        
        }
        
        if (opcion == 1 || opcion == 3){
            
            // Convertir pesos en dólares
            
            System.out.println("Pesos: ");
            pesos = leer.nextDouble();
            dolares = divisa.PesosADolares(pesos);
            
            System.out.println("Dólares: " + dolares);
            
        } else if (opcion == 2 || opcion == 4) {
            
            // Convertir dolares a pesos
            
            System.out.println("Dólares: ");
            dolares = leer.nextDouble();
            pesos = divisa.DolaresAPesos(dolares);
            
            System.out.println("Pesos: " + pesos);
            
        } else if (opcion == 5){
            
            System.out.println("El tipo de cambio es: " + divisa.TipoDeCambioFijo());
            
        } else {
            
            System.out.println("Opción erronea");
        }
   }
}
