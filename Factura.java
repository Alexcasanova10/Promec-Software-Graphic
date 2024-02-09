 
package promec.software;

 
public class Factura extends detalle_Factura{
    private String Id_Fac;

     Factura(){
         Id_Fac = "";
     }
    public String getId_Fac() {
        return Id_Fac;
    }

    /*public void setId_Fac(String Id_Fac) {
        this.Id_Fac = Id_Fac;
    }*/
    public boolean setId_Fac(String Id_Fac) {
        try {
            if (Id_Fac == null || Id_Fac.isEmpty()) {
                return false;
            }
            
            if (Id_Fac.length() == 5) {
                this.Id_Fac = Id_Fac;
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean validacion(String Id_Fac){
         if(this.Id_Fac.compareTo(Id_Fac) == 0){
            return true;
        }else {
            return false;
        } 
    }

}
