 
package promec.software;

 
public class Producto {
     private String Nombre;
    private String Descripcion;
    private double Precio;
    private int Cantidad;
    
    Producto(){
        Nombre = "";
        Descripcion = "";
        Precio = 0.0;
        Cantidad = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public boolean setNombre(String Nombre) {
        this.Nombre = Nombre;
        return true;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public boolean setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
        return true;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    //Sobrecarga de Método
    public boolean setPrecio(String Precio) {
        try {
            this.Precio = Double.valueOf(Precio);
            return true;
        }catch(Exception e){
            System.out.println("Favor de ingresar un numero");
            return false;
        }
    }
    
    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
   
     //Sobrecarga de Método
    public boolean setCantidad(String Cantidad) {
        try {
            this.Cantidad = Integer.valueOf(Cantidad);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
