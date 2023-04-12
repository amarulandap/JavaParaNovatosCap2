/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andres_marulanda.javaparanovatos.JavaParaNovatosCap3;

/**
 * @author Andres-Marulanda
 */

public class Salarios {
    
    static NumerosEnteros numeroEntero = new NumerosEnteros();
    
    //Atributos
    
    //Constructor
    public Salarios() {
        
    }
    
    //Calcular el valor de las horas extras.
    public int horasExtras(){
        
        byte horasDiurnas = 0;
        byte horasNocturnas = 0;
        int pagoHorasExtrasDiurnas = 0; 
        int pagoHorasExtrasNocturnas = 0;
        int pagoHorasExtras = 0;
        
        String mensaje = "\nIngrese las horas extras diurnas trabajadas: ";
        horasDiurnas = (byte) numeroEntero.leerNumeroEntero(mensaje);
        
        // Validar que el número de horas sea igual o mayor que cero para evitar el ingreso de cantidades negativas.
        if(horasDiurnas >= 0){
           pagoHorasExtrasDiurnas = horasDiurnas * 6402;
        }else{
            System.err.println("Error, valor negativo");
        }
        
        String mensaje1 = "Ingrese las horas extras nocturnas trabajadas: ";
        horasNocturnas = (byte) numeroEntero.leerNumeroEntero(mensaje1);
        
        if(horasNocturnas >= 0){
            pagoHorasExtrasNocturnas = horasNocturnas * 8458;
        }else{
            System.err.println("Error, valor negativo");
        }
        
        pagoHorasExtras = pagoHorasExtrasDiurnas + pagoHorasExtrasNocturnas;
        
        return pagoHorasExtras;
    }
    
    //Calcular el valor de las horas extras dominicales.
    public int horasExtrasDominicales(){
        
        int pagoHorasExtrasDominicales = 0;
        int pagoHorasExtrasDominicalesDiurnas = 0;
        int pagoHorasExtrasDominicalesNocturnas = 0;
        byte horasExtrasDominicalesDiurnas = 0;
        byte horasExtrasDominicalesNocturnas = 0;
        
        String mensaje = "\nIngrese el número de horas extras dominicales diurnas: ";
        horasExtrasDominicalesDiurnas = (byte) numeroEntero.leerNumeroEntero(mensaje);
        
        if(horasExtrasDominicalesDiurnas >= 0){
            pagoHorasExtrasDominicalesDiurnas = horasExtrasDominicalesDiurnas * 9667;
        }else{
            System.err.println("Error, valor negativo");
        }
        
        String mensaje1 = "Ingrese el número de horas extras dominicales nocturnas: ";
        horasExtrasDominicalesNocturnas = (byte) numeroEntero.leerNumeroEntero(mensaje1);
        
        if(horasExtrasDominicalesNocturnas >= 0){
            pagoHorasExtrasDominicalesNocturnas = pagoHorasExtrasDominicalesNocturnas * 12083;
        }else{
            System.err.println("Error, valor negativo");
        }
        
        pagoHorasExtrasDominicales = pagoHorasExtrasDominicalesDiurnas + pagoHorasExtrasDominicalesNocturnas;
        
        return pagoHorasExtrasDominicales;
    }
    
    //calcular los recargos nocturnos
    public int recargosNocturnos(){
        
        int pagoRecargoNocturno = 0;
        int pagoHorasNocturnas = 0;
        int pagoHorasNocturnasDominicales = 0;
        byte horasNocturnas = 0;
        byte horasNocturnasDominicales = 0;
        
        String mensaje = "\nIngrese el número de horas nocturnas: ";
        horasNocturnas = (byte) numeroEntero.leerNumeroEntero(mensaje);
        
        if(horasNocturnas >= 0){
            pagoHorasNocturnas = horasNocturnas * 1692;
        }else{
            System.err.println("Error, valor negativo");
        }
        
        String mensaje1 = "Ingrese el número de horas nocturnas dominicales: ";
        horasNocturnasDominicales = (byte) numeroEntero.leerNumeroEntero(mensaje1);
        
        if(horasNocturnasDominicales >= 0){
            pagoHorasNocturnasDominicales = horasNocturnasDominicales * 5317;
        }else{
            System.err.println("Error, valor negativo");
        }
        
        pagoRecargoNocturno = pagoHorasNocturnasDominicales + pagoHorasNocturnas;
        
        return pagoRecargoNocturno;
    }
    
    //Calcular el salario base.
    public int salarioBase(){
        
        int salarioBase = 0;
        int pagoHorasLaboradasLS = 0;
        int pagoHorasLaboradasD = 0;
        short horasLaboradasLS = 0;
        short horasLaboradasD = 0;
        
        String mensaje = "\nIngrese el número de horas laboradas de Lunes a Sabado: ";
        horasLaboradasLS = (short) numeroEntero.leerNumeroEntero(mensaje);
        
        if(horasLaboradasLS >= 0){
            pagoHorasLaboradasLS = horasLaboradasLS * 4833;
        }else{
            System.err.println("Error, valor negativo");
        }
        
        String mensaje1 = "Ingrese el número de horas laboradas en Domingo: ";
        horasLaboradasD = (short) numeroEntero.leerNumeroEntero(mensaje1);
        
        if(horasLaboradasD >= 0){
            pagoHorasLaboradasD = horasLaboradasD * 8458;
        }else{
            System.err.println("Error, valor negativo");
        }
        
        salarioBase = pagoHorasLaboradasLS + pagoHorasLaboradasD;
        
        return salarioBase;
    }
    
    public int totalSalario(){
        
        int TotalSalario = 0;
        int auxilioDeTransporte = 0;
        byte diasLaborados = 0;
        int pagoTotalSalario = 0;
        
        TotalSalario = this.salarioBase() + this.recargosNocturnos() + this.horasExtras() + this.horasExtrasDominicales() ;
        
        String mensaje = "\nIngrese el total de días laborados mas compensados: ";
        diasLaborados = (byte)numeroEntero.leerNumeroEntero(mensaje);
        
        if(diasLaborados >= 0){
            auxilioDeTransporte = diasLaborados * 4687;
        }else{
            System.err.println("Error, valor negativo");
        }
        
        pagoTotalSalario = TotalSalario + auxilioDeTransporte;
        
        return pagoTotalSalario;
    }
    
}
