package andres.marulanda.javaparanovatoscap2;
/**
 * @author Andres-Marulanda
 */

// En las clases también se pueden importar paquetes que sean necesarios para la implementación de los métodos.

public class Persona {
    
    // Definir los atributos de la clase.
    
    private String primerNombre;  // Al declarar los atributos, estos siempre serán tipo private + tipo dato + ID.
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String sexo;
    private byte edad;
    private String direccionDomicilio;
    private long numeroTelefono;
    private long numeroCelular;
    private static int personasCreadas = 0; // El modificador private indica que este es un atributo común a todos los objetos de la
                                       // clase, pero que solo se creará una vez.
   
  
    // Definir los métodos constructores.

    public Persona() {
        
        contarPersonas();
        
    }

    public Persona(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String sexo, byte edad, String direccionDomicilio, long numeroTelefono, long numeroCelular) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.sexo = sexo;
        this.edad = edad;
        this.direccionDomicilio = direccionDomicilio;
        this.numeroTelefono = numeroTelefono;
        this.numeroCelular = numeroCelular;
        
        contarPersonas();
    }
  
    
    // Definir los setters and getters.

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
    // Necesito diferenciar los tipos de sexo.
    public String getSexo() {
        
        String sexoPersona = "";
        
        if (this.sexo == "M"){
            
            sexoPersona = "Masculino";
            
        } else if (this.sexo == "F"){
            
            sexoPersona = "Femenino";
            
        } else if (this.sexo != "M" && this.sexo != "F"){
            
            sexoPersona = "Indeterminado";
        }
        
        return sexoPersona;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public int getPersonasCreadas() {
        return personasCreadas;
    }
    
    // Definir los métodos propios de la clase.
    
    static void contarPersonas (){
        
        personasCreadas++; // Para los atributos tipo static no se usa el prefijo this.
    }
    
}
