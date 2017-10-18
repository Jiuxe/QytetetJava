package qytetetjava;


public class Casilla {
    
    private int numeroCasilla;
    private int coste;
    private int numHoteles;
    private int numCasas;
    private TipoCasilla casilla;
    private TituloPropiedad titulo;

    public Casilla(int numeroCasilla, int coste, TipoCasilla casilla, TituloPropiedad titulo){
        
        this.numeroCasilla = numeroCasilla;
        this.coste = coste;
        this.numCasas = 0;
        this.numHoteles = 0;
        this.titulo = titulo;
        this.casilla =  casilla;
        
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
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    int cancelarHipoteca(){
        throw new UnsupportedOperationException("Sin implementar");
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
        throw new UnsupportedOperationException("Sin implementar");
    }
    
    int getCosteHipoteca(){
        return coste;
    }
    
    int getPrecioEdificar(){
        return titulo.getPrecioEdificar();
    }
    
    int hipotecar(){
        throw new UnsupportedOperationException("Sin implementar");
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
    

    @Override
    public String toString() {
        return "Numero Casilla = " + numeroCasilla + "\n Coste = " + coste + "\n Numero Hoteles = " + numHoteles + "\n Numero Casas = " + numCasas + "\n Casilla = " + casilla + "\n Titulo = " + titulo + "\n";
    }
}
