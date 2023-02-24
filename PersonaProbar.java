package andres.marulanda.javaparanovatoscap2;
/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class PersonaProbar {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        String primerNombre = "";
        String segundoNombre = "";
        String primerApellido = "";
        String segundoApellido = "";
        byte edadSegundaPersona = 0;
        long  telefonoFijo = 0;
        long  telefonoCelular = 0;
        
        Persona persona1 = new Persona();    // Con el constructor vacio.
        
        System.out.println("Ingrese el primer nombre: ");
        primerNombre = leer.nextLine();     // NextLine es el método de la clase Scanner que me permite capturar Strings desde el teclado.
        persona1.setPrimerNombre(primerNombre);
        
        System.out.println("Ingrese el segundo nombre: ");
        segundoNombre = leer.nextLine();
        persona1.setSegundoNombre(segundoNombre);      
        
        System.out.println("Ingrese el primer apellido: ");
        primerApellido = leer.nextLine();
        persona1.setPrimerApellido(primerApellido);
        
        System.out.println("Ingrese el segundo apellido: ");
        segundoApellido = leer.nextLine();
        persona1.setSegundoApellido(segundoApellido);
        
        /** persona1.setPrimerNombre("Maria");
         * persona1.setSegundoNombre ("Mayer");
         */
        
        System.out.println("La persona número: " + persona1.getPersonasCreadas() + " es " + persona1.getPrimerNombre() + " " 
                + persona1.getSegundoNombre() + " " + persona1.getPrimerApellido() + " " + persona1.getSegundoApellido());
        
        // Con el segundo constructor.
        
        System.out.println("\nIngrese la edad de la segunda persona: ");
        edadSegundaPersona = leer.nextByte();
        System.out.println("Ingrese el teléfono fijo de la segunda persona: ");
        telefonoFijo = leer.nextLong();
        System.out.println("Ingrese el teléfono celular de la segunda persona: ");
        telefonoCelular = leer.nextLong();
        
        Persona persona2 = new Persona("Andres", "Felipe", "Marulanda", "Patiño", "M", edadSegundaPersona, "Calle 75 sur No. 34 280", telefonoFijo, telefonoCelular);
        
        System.out.println("\nLa persona número: " + persona2.getPersonasCreadas() + " es ");
        System.out.println(persona2.getPrimerNombre() + " " + persona2.getSegundoNombre());
        System.out.println(persona2.getPrimerApellido() + " " + persona2.getSegundoApellido());
        System.out.println("Sexo: " + persona2.getSexo());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("Dirección de domicilio: " + persona2.getDireccionDomicilio());
        System.out.println("Teléfono fijo: " + persona2.getNumeroTelefono() + " Teléfono celular: " + persona2.getNumeroCelular());
    }
    
}
