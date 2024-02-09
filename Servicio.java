 
package promec.software;
 
public class Servicio extends detalle_Serv {
    private String IdServicio;

    public boolean setIdServicio(String IdServicio) {
        
     try {
            if (IdServicio == null || IdServicio.isEmpty()) {
                return false;
            }
            
            if (IdServicio.length() == 5) {
                this.IdServicio = IdServicio;
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    
    
    
    }

    public String getIdServicio() {
        return IdServicio;
    }
}
