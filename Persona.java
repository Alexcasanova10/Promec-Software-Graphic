 
package promec.software;
 
public class Persona extends Contacto{
    private String Nombre;
    private String Apellido;

    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public boolean setNombre(String Nombre) {
        this.Nombre = Nombre;
        return true;
    }    
    
    public boolean setApellido(String Apellido) {
        this.Apellido = Apellido;
        return true;
    }
}
