 
package promec.software;
 
public class Refaccion extends Producto {
    private String id_Refac;
    
    Refaccion(){
        id_Refac = "";
    }
    
    
    public String getId_Refac() {
        return id_Refac;
    }
    
    
    public boolean setId_Refac(String id_Refac) {
        try {
            if (id_Refac.length() == 5) {
                this.id_Refac = id_Refac;
                return true;
            }else {
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }
}
