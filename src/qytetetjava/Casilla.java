package qytetetjava;


public class Casilla {
    
    private int numeroCasilla;
    private int coste;
    private int numHoteles;
    private int numCasas;
    private TipoCasilla casilla;
    private TituloPropiedad titulo;
    private int hipotecaBase;
    private boolean hipotecada;

    public Casilla(int numeroCasilla, int coste, TipoCasilla casilla, TituloPropiedad titulo, int hipotecaBase){
        
        this.numeroCasilla = numeroCasilla;
        this.coste = coste;
        this.numCasas = 0;
        this.numHoteles = 0;
        this.titulo = titulo;
        this.casilla =  casilla;
        this.hipotecaBase = hipotecaBase;
        hipotecada = false;
        
    }
    
    public Casilla(int numeroCasilla, TipoCasilla casilla){
        
        this.numeroCasilla = numeroCasilla;
        this.casilla =  casilla;
      
    }
    /*--------------------------------------------------------------------------*/
    
    TituloPropiedad asignarPropietario(Jugador jugador){
        
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    int CalcularValorHipoteca(){
       int costeHipoteca = hipotecaBase + (int)(numCasas * 0.5 * hipotecaBase) + numHoteles * hipotecaBase;
       return costeHipoteca;
    }
    
    int cancelarHipoteca(){
        hipotecada = false;
        return 1;
    }
    
    int cobrarAlquiler(){
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    int edificarCasa(){
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    int edificarHotel(){
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    boolean estaHipotecada(){
        return hipotecada;
    }
    
    int getCosteHipoteca(){
        return coste;
    }
    
    int getPrecioEdificar(){
        return titulo.getPrecioEdificar();
    }
    
    int hipotecar(){
        hipoteca = true;
        return 1;
    }
    
    int precioTotalComprar(){
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    boolean propietarioEncarcelado(){
        throw new UnsupportedOperationException("Sin implementar");
    } 
    
    boolean sePuedeEdificarCasa(){
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    boolean sePuedeEdificarHotel(){
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    boolean soyEdificable(){
    
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    boolean tengoPropietario(){
        
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    int venderTitulo(){
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    void setTituloPropiedad(TituloPropiedad titulo){
        this.titulo = titulo;
    }
    
    void asignarTituloPropiedad(){
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    /*--------------------------------------------------------------------------*/
    
    TipoCasilla getTipo(){
        return casilla;
    } 
    
    int getNumeroCasilla() {
        return numeroCasilla;
    }

    int getCoste() {
        return coste;
    }
    
    int getNumHoteles() {
        return numHoteles;
    }

    int getNumCasas() {
        return numCasas;
    }

    TituloPropiedad getTituloPropiedad() {
        return titulo;
    }

    void setNumeroCasilla(int numeroCasilla) {
        this.numeroCasilla = numeroCasilla;
    }

    void setNumHoteles(int numHoteles){
        this.numHoteles = numHoteles;
    }
    
    void setNumCasas(int numCasas){   
        this.numCasas = numCasas;
    }

    @Override
    public String toString() {
        return "Numero Casilla = " + numeroCasilla + "\n Coste = " + coste + "\n Numero Hoteles = " + numHoteles + "\n Numero Casas = " + numCasas + "\n Casilla = " + casilla + "\n Titulo = " + titulo + "\n";
    }
}
