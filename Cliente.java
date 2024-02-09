 
package promec.software;

public class Cliente extends Persona{
    private String Id;
    private String Placa;
    private String ModeloCoche;
 
    public String getId() {
        return Id;
    }

    public boolean setId(String Id) {
        try {
            if (Id == null || Id.isEmpty()) {
                return false;
            }
            
            if (Id.length() == 5) {
                this.Id = Id;
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    public String getPlaca() {
        return Placa;
    }

    public boolean setPlaca(String Placa) {
        this.Placa = Placa;
        return true;
    }
    
    public String getModeloCoche() {
        return ModeloCoche;
    }
    public boolean setModeloCoche(String ModeloCoche) {
        this.ModeloCoche = ModeloCoche;
        return true;
    }
}
