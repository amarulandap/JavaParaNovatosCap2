package andres_marulanda.javaparanovatos.JavaParaNovatosCap3;
/**
 * @author Andres-Marulanda
 */
public class ProbarClases3 {

    /**
     * @param args the command line arguments
     */
    
    static NumerosEnteros numeroEntero = new NumerosEnteros();
    static AdivinaElNumero adivinandoNumeros = new AdivinaElNumero();
    static Salarios nuevoSalario = new Salarios();
    
    public static void main(String[] args) {
        
        // numerosPrimos();
        // adivinaElNumero();
        // calcularSalario();
       
    }
    
    public static void numerosPrimos(){
        
        String mensaje = "Ingrese el número que desea validar: ";
        int numeroAValidar = numeroEntero.leerNumeroEntero(mensaje);
        boolean primo;
        
        NumerosPrimos numeroPrimo = new NumerosPrimos(numeroAValidar);
        
        primo = numeroPrimo.validarPrimo();
        
        if(primo == true){
            System.out.println("El número " + numeroAValidar + " es primo");
        }else{
            System.out.println("El número " + numeroAValidar + " no es primo");
        }
        
    }
    
    public static void adivinaElNumero(){
        
        byte intentos = 0;
        boolean adivinar = false;
        while(adivinar == false){
            
            intentos++;
            byte numeroIngresado = (byte)numeroEntero.leerNumeroEntero("Ingrese un número entre 1 y 100: ");
            
            byte opcion = adivinandoNumeros.compararNumeros(numeroIngresado);
            
            if(opcion == 1){
                System.out.println("Número fuera de rango");
                
            }else if(opcion == 2){
                System.out.println("Número demasiado mayor");
                
            }else if(opcion == 3){
                System.out.println("El número sigue siendo mayor");
                
            }else if(opcion == 4){
                System.out.println("Número mayor, pero ya estás cerca");
                
            }else if(opcion == 5){
                System.out.println("Número demasiado menor");
                
            }else if(opcion == 6){
                System.out.println("El número sigue siendo menor");
                
            }else if(opcion == 7){
                System.out.println("Número menor, pero ya estás cerca");
                
            }else if (opcion == 8){
                System.out.println("Felicitaciones, adivinaste");
                adivinar = true;
            }
        }   
    }
    
    public static void calcularSalario(){
        
        int salarioAPAgar = nuevoSalario.totalSalario();
        
        System.out.println("\nSalario mensual: $" + salarioAPAgar);
    }
}
