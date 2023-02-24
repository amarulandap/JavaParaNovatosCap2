package andres.marulanda.javaparanovatoscap2;
/**
 * @author Andres-Marulanda
 */
public class Restaurante {
    
    // Atributos
    
    private int docenasHuevos;
    private int unidadesHuevos;     // Almacenar la cantidad de huevos en unidades.
    private double kilosChorizo;
    
    // Constructor recibirá el número de docenas de huevos y de kilos de chorizo disponibles en el frigorífico.

    public Restaurante(int docenasHuevos, double kilosChorizo) {
        this.docenasHuevos = docenasHuevos;
        this.kilosChorizo = kilosChorizo;
        this.unidadesHuevos = this.docenasHuevos * 12;      // Huevos en unidades.
    }
    
    // ste y get para cada atributo.

    public int getDocenasHuevos() {
        return docenasHuevos;
    }

    public void setDocenasHuevos(int docenasHuevos) {
        this.docenasHuevos = docenasHuevos;
    }

    public double getKilosChorizo() {
        return kilosChorizo;            // Devuelve el número de kilos de chorizo que quedan en la cámara.
    }

    public void setKilosChorizo(double kilosChorizo) {
        this.kilosChorizo = kilosChorizo;
    }
    
    public int getHuevos (){
        return unidadesHuevos;          // La cantidad de huevos en unidades.
    }
    
    public void addHuevos(int docenas){
        
        this.docenasHuevos += docenas;
        this.unidadesHuevos += docenas * 12;
    }
    
    public void addChorizos (double chorizos){
        
        this.kilosChorizo += chorizos;
    }
    
    public void sirvePlato(int cantidadPlatos){
        
        this.unidadesHuevos -= 2 * cantidadPlatos;
        this.kilosChorizo -=0.2 * cantidadPlatos;
    }
    
    public int getNumPLatos (){
        
        int numPlatos = 0;
        
        if (this.unidadesHuevos / 2 < this.kilosChorizo * 5){
            
            numPlatos = (this.unidadesHuevos / 2);
        } else {
            
            numPlatos = (int)(this.kilosChorizo * 5);
        }
        
        return numPlatos;
    }
    
}
