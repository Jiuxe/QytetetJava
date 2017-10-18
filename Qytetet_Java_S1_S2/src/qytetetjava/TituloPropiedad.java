package qytetetjava;

public class TituloPropiedad {

    private String nombre;
    private boolean hipotecado;
    private int alquilerBase;
    private float factorRevalorizacion;
    private int hipotecaBase;
    private int precioEdificar;
    
    public TituloPropiedad(String nombre, int alquilerBase, int hipotecaBase, int precioEdificar, float factorRevalorizacion){
        
        this.nombre = nombre;
        this.alquilerBase = alquilerBase;
        this.factorRevalorizacion = factorRevalorizacion;
        this.hipotecaBase = hipotecaBase;
        this.hipotecado = false;
        this.precioEdificar = precioEdificar;
        
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getHipotecado() {
        return hipotecado;
    }

    public int getAlquilerBase() {
        return alquilerBase;
    }

    public float getFactorRevalorizacion() {
        return factorRevalorizacion;
    }

    public int getHipotecaBase() {
        return hipotecaBase;
    }

    public int getPrecioEdificar() {
        return precioEdificar;
    }
    
    public String toString(){
        
        return "\nNombre = " + nombre + "\nAlquiler Base = " + alquilerBase + "\nHipoteca Base = " + hipotecaBase + "\nPrecio Edificar = " + precioEdificar + "\n" ;
    }
    
}
