 
package promec.software;
 
public class Tecnico extends Persona {
    private String Id_Tec;

    public String getId_Tec() {
        return Id_Tec;
    }

    public boolean setId_Tec(String Id_Tec) {
         try {
            if (Id_Tec == null || Id_Tec.isEmpty()) {
                return false;
            }
            
            if (Id_Tec.length() == 5) {
                this.Id_Tec = Id_Tec;
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }



    }

   
}
