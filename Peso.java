package andres.marulanda.javaparanovatoscap2;
/**
 * @author Andres-Marulanda
 */

import java.util.Scanner;

public class Peso {
    
    static Scanner leer = new Scanner (System.in);
    
    // Atributos
    
    private double peso;
    private String unidadMedida;
    
    // Constructor

    public Peso(double peso, String unidadMedida) {
        this.peso = peso;
        this.unidadMedida = unidadMedida;
        
    }
    
    // set y get

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
    // Métodos
    
    public void getLibras (){
        
        double libras = 0.0;
        
        if (this.unidadMedida == "kilogramos"){
            
            libras = this.peso * 2.2046;
        } else if (this.unidadMedida == "onzas"){
            
            libras = this.peso * 0.0625;
        } else if (this.unidadMedida == "gramos"){
            
            libras = (this.peso * 2.2046) / 1000;
        }
        
        System.out.println("El peso es: " + libras + " Libras");
        
    }
    
    public void getOnzas(){
        
        double onzas = 0.0;
        
        if (this.unidadMedida == "kilogramos"){
            
            onzas = this.peso * 35.274;
        } else if (this.unidadMedida == "libras"){
            
            onzas = this.peso / 0.0625;
        } else if (this.unidadMedida == "gramos"){
            
            onzas = (this.peso * 35.274) / 1000;
        }
        
        System.out.println("El peso es: " + onzas + " Onzas");
    }
    
    public void getKilos(){
        
        double kilos = 0.0;
       
        if (this.unidadMedida == "onzas"){
            
            kilos = this.peso / 35.274;
        } else if (this.unidadMedida == "libras"){
            
            kilos = this.peso * 0.453592;
        } else if (this.unidadMedida == "gramos"){
            
            kilos = this.peso / 1000;
        }
        
        System.out.println("El peso es :" + kilos + " Kilos");
    }
    
}
