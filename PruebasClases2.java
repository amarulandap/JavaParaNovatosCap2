package andres.marulanda.javaparanovatoscap2;
/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class PruebasClases2 {
    
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        probarRestaurante();
    }
    
    public static void probarRestaurante(){
        
        byte opcion = 0;
        int docenas = 0;
        double kilos = 0.0;
        
        System.out.println("Ingrese la cantidad inicial de docenas: ");
        try{
            docenas = leer.nextInt();
        }catch (Exception e) {
            e.printStackTrace();   
        }
        
        System.out.println("Ingrese la cantidad inicial de kilos: ");
        try{
            kilos = leer.nextDouble();
        }catch (Exception e) {
            e.printStackTrace();   
        }
        
        Restaurante frigorifico = new Restaurante(docenas, kilos);
        
        // Servir dos platos.
        frigorifico.sirvePlato(2);
        
        // Obtener la cantidad de huevos y de chorizos.
        System.out.println("La cantidad de huevos es: " + frigorifico.getHuevos() + 
                " unidades, y la cantidad de chorizos es: " + frigorifico.getKilosChorizo() + " Kilos");
        
        // Ingresar dos docenas de huevos.
        frigorifico.addHuevos(2);
        
        // Obtener la nueva cantidad de huevos.
        System.out.println("La nueva cantidad de huevos es: " + frigorifico.getHuevos() + " Unidades");
        
        // Ingresar 2.5 kilos de chorizo.
        frigorifico.addChorizos(2.5);
        
        // La nueva cantidad de kilos de chorizo.
        System.out.println("La nueva cantidad de chorizo es: " + frigorifico.getKilosChorizo() + " Kilos");
        
        // Servir 3 platos mas.
        frigorifico.sirvePlato(3);
        System.out.println("La nueva cantidad de huevos es: " + frigorifico.getHuevos() + " Unidades");
        System.out.println("La nueva cantidad de chorizo es: " + frigorifico.getKilosChorizo() + " Kilos");
        
        // Calcular cuantos platos podemos servir.
        System.out.println("Platos que puede servir: " + frigorifico.getNumPLatos());
        
        // Ingresar una docena de huevos + 2 kilos de chorizo.
        frigorifico.addHuevos(1);
        frigorifico.addChorizos(2);
        
        //Servir dos platos.
        frigorifico.sirvePlato(2);
        
        // Calcular la cantidad de platos que podemos servir.
        System.out.println("La nueva cantidad de huevos es: " + frigorifico.getHuevos() + " Unidades");
        System.out.println("La nueva cantidad de chorizo es: " + frigorifico.getKilosChorizo() + " Kilos");
        System.out.println("Platos que puede servir: " + frigorifico.getNumPLatos());
    }
    
}
