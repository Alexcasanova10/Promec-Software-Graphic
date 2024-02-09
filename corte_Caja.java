package promec.software;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class corte_Caja {
    Date fechaHoy = new Date ();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String formatoFecha = sdf.format(fechaHoy);
    
    private String fecha;
    private double Monto_Total;
    private double ingresos;
    private double egresos;

    corte_Caja(){
        fecha = "";
        Monto_Total = 0.0;
        ingresos = 0.0;
        egresos = 0.0;
   }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = formatoFecha;
        System.out.println(formatoFecha);
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    
    public boolean setIngresos (String ingresos) {
        
        try {
            if (ingresos == null || ingresos.isEmpty()) {
                return false;
            }else{
                this.ingresos = Double.valueOf(ingresos);
                return true;
            }
        }catch(Exception e){
            return false;
        }
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }
    
    public boolean setEgresos (String egresos) {
        try {
            if (egresos == null || egresos.isEmpty()) {
                return false;
            }else {
                this.egresos = Double.valueOf(egresos);
                return true;
            }
        }catch(Exception e){
            return false;
        }
    }
    
    public double getMonto_Total() {
        return Monto_Total;
        
    }
    
    public void setMonto_Total(double Monto_Total) {
        this.Monto_Total = Monto_Total;
        Monto_Total = ingresos - egresos;
    }   
    


    public boolean validar_Monto(){
        do {
            if (Monto_Total == ingresos + egresos) {
                System.out.println("Monto total correctamente validado");
                return true;
            }else {
                System.out.println("Existe discrepancia en el monto total, favor de validar nuevamente");
                return false;
            }
        } while (Monto_Total != ingresos + egresos);
    }
    
}
