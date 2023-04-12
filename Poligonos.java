/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andres_marulanda.javaparanovatos.JavaParaNovatosCap3;
/**
 * @author Andres-Marulanda
 */

public class Poligonos {
    
    //Atributos
    private byte numeroLados;
    private short longitudLado;     //En centimetros.
    private short apotema;          //En centimetros.
    private String nombrePoligono;
    
    //Constructores
    public Poligonos(){
        
    }
    
    public Poligonos(byte numeroLados, short longitudLado, short apotema){
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
        this.apotema = apotema;
    }
    
    //Set and Get

    public byte getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(byte numeroLados) {
        this.numeroLados = numeroLados;
    }

    public short getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(short longitudLado) {
        this.longitudLado = longitudLado;
    }

    public short getApotema() {
        return apotema;
    }

    public void setApotema(short apotema) {
        this.apotema = apotema;
    }

    public String getNombrePoligono() {
        return nombrePoligono;
    }

    public void setNombrePoligono(String nombrePoligono) {
        this.nombrePoligono = nombrePoligono;
    }
    
    //Métodos.
    public int calcularArea(){
        
        int area = 0;
        
        area = this.numeroLados * this.longitudLado * (this.apotema / 2);
        
        return area;
    }
    
    public int calcularPerimetro(){
        
        int perimetro = 0;
        
        perimetro = this.numeroLados * this.longitudLado;
        
        return perimetro;
    }
    
    public String nombrePoligono(){
        
        if(this.numeroLados == 3){
            this.setNombrePoligono("Triángulo");
            
        }else if(this.numeroLados == 4){
            this.setNombrePoligono("Cuadrado");
            
        }else if(this.numeroLados == 5){
            this.setNombrePoligono("Pentágono");
            
        }else if(this.numeroLados == 6){
            this.setNombrePoligono("Hexágono");
            
        }else if(this.numeroLados == 7){
            this.setNombrePoligono("Heptágono");
            
        }else if(this.numeroLados == 8){
            this.setNombrePoligono("Octágono");
            
        }else if(this.numeroLados == 9){
            this.setNombrePoligono("Eneágono");
            
        }else if(this.numeroLados == 10){
            this.setNombrePoligono("Decágono");
            
        }else if(this.numeroLados == 11){
            this.setNombrePoligono("Undecágono");
            
        }else if(this.numeroLados == 12){
            this.setNombrePoligono("Dodecágono");
            
        }else{
            System.out.println("El número de lados es superior a 12");
        }
        
        return this.nombrePoligono;
    }
    
    
}
