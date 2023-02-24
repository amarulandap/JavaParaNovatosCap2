package andres.marulanda.javaparanovatoscap2;
/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class PruebasClases1 {
    
    static Scanner leer = new Scanner (System.in);
    static MiNumero numeroUsuario = new MiNumero();

    public static void main(String[] args) {
        
        probarMiNumero();
        probarPeso();
        probarDistancia();
        
    }
    
    public static void probarMiNumero (){
        
        byte opcion = 0;    // opción seleccionada por el usuario.
        int numero = 0;     // número ingresado por el usuario.
        
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Para que el número sea igual a 0.");
        System.out.println("2. Para que el número tenga un valor diferente de 0.");
        try {
            
            opcion = leer.nextByte();
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        if (opcion == 1){
            
           MiNumero numeroUsuario = new MiNumero();
           
           numeroUsuario.cambiaNumero();
           numeroUsuario.suma();
           numeroUsuario.resta();
           numeroUsuario.getDoble();
           numeroUsuario.getTriple();
           numeroUsuario.getCruadruple();
            
        } else if (opcion == 2){
            
           System.out.println("Ingrese un número entero diferente de 0.");
           numero = leer.nextInt();
           MiNumero numeroUsuario = new MiNumero (numero);
           
           numeroUsuario.cambiaNumero();
           numeroUsuario.suma();
           numeroUsuario.resta();
           numeroUsuario.getDoble();
           numeroUsuario.getTriple();
           numeroUsuario.getCruadruple();
           
        } else {
            
            System.out.println("Opción incorrecta");
        }
    }  
    
    public static void probarPeso (){
        
        byte opcion = 0;    // Opción seleccionada por el usuario.
        double peso = 0.0;  // Peso ingresado por el usuario.
        String unidad = null; // Unidad de medida del peso ingresado.
        
        System.out.println("Seleccione la unidad de medida: ");     // Unidad de medida
        System.out.println("1. Libras.");
        System.out.println("2. Kilogramos.");
        System.out.println("3. Onzas.");
        try{
            
            opcion = leer.nextByte();
        }catch (Exception e) {
            
            e.printStackTrace();
        }
        
        System.out.println("Ingrese el peso: ");    // Peso ingresado
        try{
            
            peso = leer.nextDouble();
        }catch (Exception e){
            
            e.printStackTrace();
        }
        
        if (opcion == 1){
            
            unidad = "libras";
            Peso nuevoPeso = new Peso (peso, unidad);
            nuevoPeso.getKilos();
            nuevoPeso.getOnzas();
   
        } else if (opcion == 2){
            
            unidad = "kilogramos";
            Peso nuevoPeso = new Peso (peso, unidad);
            nuevoPeso.getOnzas();
            nuevoPeso.getLibras();
            
        } else if (opcion == 3){
            
            unidad = "onzas";
            Peso nuevoPeso = new Peso (peso, unidad);
            nuevoPeso.getKilos();
            nuevoPeso.getLibras();
            
        } else{
            
            System.out.println("Opción erronea");
        }
    }
    
    public static void probarDistancia (){
        
        double distancia = 0.0;
        byte opcion = 0;
        Distancia convertir = new Distancia();
        
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Convertir a Metros.");
        System.out.println("2. Convertir a kilometros.");
        try{
            opcion = leer.nextByte();
        }catch (Exception e){
            e.printStackTrace();
        }
        
        System.out.println("Ingrese el valor en millas: ");
        try{
            distancia = leer.nextDouble();
        }catch (Exception e){
            e.printStackTrace();
        }
        
        if (opcion == 1){
            
            System.out.println(distancia + " Millas = " + convertir.millasAMetros(distancia) + " Metros");
            
        }else if (opcion == 2){
            
            System.out.println(distancia + " Millas = " + convertir.millasAKilometros(distancia) + " Metros");
            
        }else{
            
            System.out.println("Opción erronea");
        }
    }
}