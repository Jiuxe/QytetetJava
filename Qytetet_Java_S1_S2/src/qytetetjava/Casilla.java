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
    
    
    public int getNumeroCasilla() {
        return numeroCasilla;
    }

    public int getCoste() {
        return coste;
    }

    public int getNumHoteles() {
        return numHoteles;
    }

    public int getNumCasas() {
        return numCasas;
    }

    public TipoCasilla getCasilla() {
        return casilla;
    }

    public TituloPropiedad getTitulo() {
        return titulo;
    }

    public void setNumeroCasilla(int numeroCasilla) {
        this.numeroCasilla = numeroCasilla;
    }

    public void setNumHoteles(int numHoteles) {
        this.numHoteles = numHoteles;
    }
    

    @Override
    public String toString() {
        return "Numero Casilla = " + numeroCasilla + "\n Coste = " + coste + "\n Numero Hoteles = " + numHoteles + "\n Numero Casas = " + numCasas + "\n Casilla = " + casilla + "\n Titulo = " + titulo + "\n";
    }
}
