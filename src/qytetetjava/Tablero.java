package qytetetjava;

import java.util.ArrayList;

public class Tablero {
    
    private ArrayList<Casilla> casillas;
    private Casilla carcel;
    
    public Tablero(){
        inicializar();
    }
    
    /*----------------------------------------------------------------------------*/
    
    boolean esCasillaCarcel(int numCasilla){
        
        return false;
    }
    
    Casilla obtenerCasillaNumero(int numeroCasilla){
        return casillas[numeroCasilla];

    }
    
    Casilla obtenerNuevaCasilla(Casilla casilla, int desplazamiento){
        throw new UnsupportedOperationException("Sin implementar");        
    }
    
    /*-----------------------------------------------------------------------------*/
    
    private void inicializar(){
        
        casillas = new ArrayList();
        casillas.add(new Casilla (0, TipoCasilla.SALIDA));
        casillas.add(new Casilla (1, 150, TipoCasilla.CALLE, new TituloPropiedad( "Dept. Arquitectura de Computadores", 50, 150, 250, 10)));
        casillas.add(new Casilla (2, 150, TipoCasilla.CALLE, new TituloPropiedad( "Dept. Ciencia de la Computacion e Inteligencia Artificial", 50, 150, 250,10)));
        casillas.add(new Casilla (3, TipoCasilla.SORPRESA));
        casillas.add(new Casilla (4, 220, TipoCasilla.CALLE, new TituloPropiedad( "Dept. Arquitectura de Computadores", 55, 220, 300, 10)));
        casillas.add(new Casilla (5, TipoCasilla.SORPRESA));
        casillas.add(new Casilla (6, 250, TipoCasilla.CALLE, new TituloPropiedad( "Dept. Teoria de la señal, telematica y comunicaciones", 60, 250, 300, 10)));
        casillas.add(new Casilla (7, 300, TipoCasilla.CALLE, new TituloPropiedad( "Dept. Algebra", 65, 300, 300, 10)));
        casillas.add(new Casilla (8, 320, TipoCasilla.CALLE, new TituloPropiedad( "Dept. Analisis Matematico", 65, 320, 300, 10)));
        casillas.add(new Casilla (9, TipoCasilla.IMPUESTO));
        carcel = new Casilla (10, TipoCasilla.CARCEL);
        casillas.add(carcel);
        casillas.add(new Casilla (11, 400, TipoCasilla.CALLE, new TituloPropiedad( "Dept. Lenguajes y sistemas informáticos", 70, 400, 350, 20)));
        casillas.add(new Casilla (12, TipoCasilla.PARKING));
        casillas.add(new Casilla (13, 450, TipoCasilla.CALLE, new TituloPropiedad( "Dept. Electronica y tecnologia de computadores", 70, 450, 350, 20)));
        casillas.add(new Casilla (14, 500, TipoCasilla.CALLE, new TituloPropiedad( "Dept. Arquitectura de Computadores", 80, 500, 400, 20)));
        casillas.add(new Casilla (15, TipoCasilla.SORPRESA));
        casillas.add(new Casilla (16, 520, TipoCasilla.CALLE, new TituloPropiedad( "Dept. Estadistica e investigacion operativa", 80, 520, 400, 20)));
        casillas.add(new Casilla (17, 550, TipoCasilla.CALLE, new TituloPropiedad( "Dept. Fisica aplicada", 80, 550, 400, 20)));
        casillas.add(new Casilla (18, TipoCasilla.JUEZ));
        casillas.add(new Casilla (19, 550, TipoCasilla.CALLE, new TituloPropiedad( "ValdiBingo", 100, 600, 500, 20)));

    }

    Casilla getCarcel() {
        return carcel;
    }

    @Override
    public String toString() {
        return "Tablero{" + "casillas=" + casillas + '}';
    }
}


public class Vehicle_to_tablero {
    //defining class
    // fields for vehicle
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has
    // one constructor
    public Vehicle_to_tablero(int startc, int starts, int startg) {
        gear = startg;
        cadence = startc;
        speed = starts;
    }
        
    // tablero methods
    public void set_C(int row_f_c) {
        cadence = row_f_c;
    }
        
    public void set_G(int n_v) {
        gear = n_v;
    }
        
    public void braker(int d_t) {
        speed -= d_t + 1;
    }
        
    public void aint_faster(int i_t) {
        speed += i_t + 1;
    }
        
}
