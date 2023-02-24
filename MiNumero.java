package andres.marulanda.javaparanovatoscap2;
/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class MiNumero {
    
    static Scanner leer = new Scanner (System.in);
    
    // Atributos
    
    private int valorNumero;
    
    // Constructores

    public MiNumero() {                 // Establecer el valor del número en cero.
        this.valorNumero = 0;
    }

    public MiNumero(int valorNumero) {  // Asignar al número un valor ingreasdo por el usuario.
        this.valorNumero = valorNumero;
    }
    
    // Set y get

    public int getValorNumero() {
        return valorNumero;
    }

    public void setValorNumero(int valorNumero) {
        this.valorNumero = valorNumero;
    }
    
    // Métodos
    
    public void cambiaNumero (){     // Asignar un nuevo valor al número.
        
        int nuevoNumero = 0;
        
        System.out.println("Si desea, ingrese un nuevo número. Si no, ingrese el mismo: ");
        nuevoNumero = leer.nextInt();
        this.setValorNumero(nuevoNumero);
        
    }
    
    public void suma (){
        
        int numeroASumar;
        
        System.out.println ("Ingrese la cantidad a sumar: ");
        numeroASumar = leer.nextInt();
        
        int resultadoSuma = this.getValorNumero() + numeroASumar;
        
        System.out.println("Suma = " + resultadoSuma);
    }
    
    public void resta (){
        
        int numeroARestar;
        
        System.out.println ("Ingrese la cantidad a restar: ");
        numeroARestar = leer.nextInt();
        
        int resultadoResta = this.getValorNumero() - numeroARestar;
        
        System.out.println("Resta = " + resultadoResta);
    }
    
    public void getDoble (){
        
        System.out.println("Doble = " + (2*this.getValorNumero()));
    }
    
    public void getTriple(){
        
        System.out.println("Triple = " + (3*this.getValorNumero()));
    }
     
    public void getCruadruple (){
        
        System.out.println("Cuadruple = " + (4*this.getValorNumero()));
    }
    
}
