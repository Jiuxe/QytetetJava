package qytetetjava;

public class TituloPropiedad {

    private String nombre;
    private boolean hipotecado;
    private int alquilerBase;
    private int factorRevalorizacion;
    private int hipotecaBase;
    private int precioEdificar;
    private Casilla casilla;
    private Jugador propietario;
    private int crotolamo;
    
    public TituloPropiedad(String nombre, int alquilerBase, int hipotecaBase, int precioEdificar, int factorRevalorizacion, int crotolamo){
        
        this.nombre = nombre;
        this.alquilerBase = alquilerBase;
        this.factorRevalorizacion = factorRevalorizacion;
        this.hipotecaBase = hipotecaBase;
        this.hipotecado = false;
        this.precioEdificar = precioEdificar;
        this.crotolamo = crotolamo;
        
    }
      
    /*----------------------------------------------------------------------------*/
    
    void cobrarAlquiler(int coste){
        this.jugador.saldo += coste; 
    }
    
    boolean propietarioEncarcelado(){
        
        return false;
    }
    
    void setCasilla(Casilla casilla){
        this.casilla = casilla
    }
    
    void setHipotecada(boolean hipotecada){
        this.hipotecado = hipotecada
    }
    
    void setPropietario(Jugador propietario){
        this.propietario = propietario;
    }
    
    boolean tengoPropiedad(){
        
        return this.puedoEdificar;
    }
    
    /*----------------------------------------------------------------------------*/
    public String getNombre() {
        return nombre;
    }

    public boolean getHipotecado() {
        return hipotecado;
    }

    public int getAlquilerBase() {
        return alquilerBase;
    }

    public int getFactorRevalorizacion() {
        return factorRevalorizacion;
    }

    public int getHipotecaBase() {
        return hipotecaBase;
    }

    public int getPrecioEdificar() {
        return precioEdificar;
    }
    
    Jugador cambioPropietario(Jugador propietario){
        Jugador temp = this.propietario; 
        this.propietario = newPropietario;
        return temp;
    }
    
    public int getCrotolamo(){
        return this.crotolamo;
    }
    
    public void setCrotolamo(int c){
        this.cotolamo = c;
    }
    
    class esta{
        private int tam;
        private String cagaste;
        
        public esta(int tula){
            tam = tula;
            cagaste = "que es crotolamo";
        }
        
        public String ReCagaste(int croto){
            if (croto > 100){
                System.out.println(cagaste);
                System.out.println("esta");
            }
        }
    }
    
    public void crotolamizar(int tula){
       esta es = new esta(tula);
       es.ReCagaste(croto);
    }
    
    public String toString(){
        
        return "\nNombre = " + nombre + "\nAlquiler Base = " + alquilerBase + "\nHipoteca Base = " + hipotecaBase + "\nPrecio Edificar = " + precioEdificar + "\n" ;
    }
    
}
