 
package promec.software;
 
public class Contacto extends usuario {
     private String Email;
    private int Telefono;
     
    public String getEmail() {
        return Email;
    }
    
    public boolean setEmail(String Email) {
        if(Email.contains("@") && Email.contains(".") && !Email.contains(" ")){
            this.Email = Email.toLowerCase();
            return true;
        }
        else {
            return false;
        }
    }

    public int getTelefono() {
        return Telefono;
    }
    
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    public boolean setTelefono(String Telefono) {
        try {
            this.Telefono = Integer.valueOf(Telefono);
            if(Telefono.length() <= 10) {
                return true;
            }else {
                return false;
            }
        }catch(Exception e){
            return false;
        }
        
    }
}
