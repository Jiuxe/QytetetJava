package qytetetjava;

import java.util.ArrayList;

public class QytetetJava {
    
    public static final int MAX_JUGADORES = 4;
    static final int MAX_CASILLAS = 20;
    static final int PRECIO_LIBRETAD = 200;
    static final int SALDO_SALIDA = 1000;
    static final int MAX_CARTAS = 10;
    static ArrayList<Sorpresa> mazo = new ArrayList(MAX_CARTAS);
    static ArrayList<Jugador> MAXJUGADORES = new ArrayList(MAX_JUGADORES);
    private static Sorpresa cartaActual;
    private static Jugador jugadorActual;
    private static Tablero tablero;
    private static Dado dado = new Dado();
    
    
    /*----------------------------------------------------------------------------*/
    
    public static boolean aplicarSopresa(){    
        
        
        switch(cartaActual.tipo){
            
            case IRACASILLA:
                
                jugadorActual.actualizarPosicion(tablero.obtenerCasillaNumero(cartaActual.valor));
                return true;
                
            case PAGARCOBRAR:
                
                jugadorActual.modificarSaldo(cartaActual.valor);
                return true;
                
            case PORCASAHOTEL:
                
                int valor = cartaActual.valor * jugadorActual.cuantasCasasHotelesTengo();
                jugadorActual.modificarSaldo(valor);
                return true;
                
            case PORJUGADOR:
                
                int valor2 = cartaActual.valor * (MAXJUGADORES.size() - 1);
                jugadorActual.modificarSaldo(valor2);
                return true;
                
            case SALIRCARCEL:
                
                jugadorActual.setEncarcelado(false);
                return true;

        }
                
        return false;
    }   
    
    public static boolean cancelarHipoteca( Casilla casilla){
        
        if(casilla.estaHipotecada()){
        
            casilla.getTituloPropiedad().setHipotecada(false);
            return true;
        }
        
        return false;
    } 
    
    public static boolean comprarTituloPropiedad(){
    
        int valorPA = jugadorActual.getCasillaActual().getCoste();
        
        if((jugadorActual.obtenerCapital() - valorPA) > 0){
            
            return jugadorActual.comprarTitulo();
            
        }
        return false;
    }
    
    public static boolean edificarHotel(Casilla casilla){
    
        if(casilla.sePuedeEdificarHotel()){
        
            casilla.setNumHoteles(casilla.getNumHoteles() + 1);
            return true;
        }
        return false;
    }
    
    public static boolean edificarCasa(Casilla casilla){
    
        if(casilla.sePuedeEdificarCasa()){
       
            //casilla.setNumCasas(casilla.getNumCasas() + 1);
            return true;
        }
        return false;
    }
    
    public static Sorpresa getCartaActual(){
    
        return cartaActual;
    }
    
    public static Jugador getJugadorActual(){
    
        return jugadorActual;
    }
    
    public static boolean hipotecarPropiedad(Casilla casilla){
    
        if(!casilla.estaHipotecada()){
        
            casilla.getTituloPropiedad().setHipotecada(true);
            return true;
        }
        
        return false;
    }
    
    public static boolean intentarSalirCarcel( MetodoSalirCarcel metodo){
    
        switch (metodo){
            
            case TIRANDODADO:
                if(dado.tirar() >= 5){
                    return true;
                }
            
            case PAGANDOLIBERTAD:
                
                jugadorActual.modificarSaldo(-200);
                return true;
        }
        return false;
    }
    
    public static void inicializarJuego(String nombres[]){
    
        inicializarTablero();
        inicializarSorpresas();
        inicializarJugadores(nombres);
        salidaJugadores();
    
        
        
    }
    
    public static boolean jugar(){
        
        String nombres[] = new String[MAX_JUGADORES];
        
        nombres[0] = "Player 1";
        nombres[1] = "Player 2";
        nombres[2] = "Player 3";
        nombres[3] = "Player 4";
        
        inicializarJuego(nombres);
        
        return false;
    }
            
    /*public static List[] obtenerRanking(){
        
        
        
    
    }
    
    public static Casilla[] propiedadesHipotecadasJugador(boolean hipotecadas){   //--------------IDK--------------------
        
        
        
    }*/
    
    public static Jugador siguienteJugador(){
    
        int indice = MAXJUGADORES.indexOf(jugadorActual);
        
        if(indice+1 < MAXJUGADORES.size()){
            return MAXJUGADORES.get(indice+1);
        }else{
            return MAXJUGADORES.get(0);
        }
    }
    
    public static boolean venderPropiedad(Casilla casilla){
        
        int valorTotal = casilla.getCoste()+(casilla.getNumCasas()+casilla.getNumHoteles())*casilla.getPrecioEdificar();
        jugadorActual.modificarSaldo(valorTotal*casilla.getTituloPropiedad().getFactorRevalorizacion());
        //jugadorActual.eliminarDeMisPropiedades(casilla);                                                   //--------------WTF----------------
        
        return false;
    }
            
    private static void encarcelarJugador(){
        
        jugadorActual.setEncarcelado(true);
        
    }
    
    private static void inicializarJugadores(String nombres[]){
        
        for(int i=0; i<nombres.length; i++){
            
            MAXJUGADORES.add(new Jugador(nombres[i])); 
        }
    }
    
    private static void inicializarTablero(){
        
        tablero = new Tablero();
    }
    
    private static void salidaJugadores(){
            
        for(int i=0; i<MAXJUGADORES.size(); i++){
            
            MAXJUGADORES.get(i).actualizarPosicion(tablero.obtenerCasillaNumero(0));
        }
    }
    
    /*------------------------------------------------------------------------------*/
    
    private static void inicializarSorpresas(){
        
        mazo.add(new Sorpresa ("Faltas a un Examen Final por quedarte dormido. Debes ir a la carcel", tablero.getCarcel().getNumeroCasilla(), TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Consigues un justificante falso argumentando que has tenido Lagunosis. Sales carcel", 0, TipoSorpresa.SALIRCARCEL));
        mazo.add(new Sorpresa ("Encuentras unos apuntes debajo de tu mesa y los vendes por Amazon, Consigues 500€", 500, TipoSorpresa.PAGARCOBRAR));
        mazo.add(new Sorpresa ("Saliendo de la universidad a las 21:30 te atracan, Paga 500€", -500, TipoSorpresa.PAGARCOBRAR));
        mazo.add(new Sorpresa ("Estabas en Clase y de repente. BINGO", 19, TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Terminas el codigo que tanto te ha costado pero se te olvida guardarlo. Vuelve a empezar", 0, TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Tienes un 4,9 en PDOO. Es hora de ir a suplicar al Departamento", 11 , TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Se necesita dinero para construir el tercer edificio de la ETSIIT. Paga 100 por cada Casa", -100, TipoSorpresa.PORCASAHOTEL));
        mazo.add(new Sorpresa ("Llevas 8 años en la carrera y aun tienes asignaturas de primero. Pagas 200 a cada Jugador", -200, TipoSorpresa.PORJUGADOR));
        mazo.add(new Sorpresa ("Acoges a estudiantes de Erasmus en tu casa. Cobra 100 por cada hotel", 100, TipoSorpresa.PORCASAHOTEL));
        mazo.add(new Sorpresa ("Encontra de tu voluntad te eligen delegado de la Clase. Cobra 100 a cada Jugador", 100, TipoSorpresa.PORJUGADOR));
    
    }
    
    
    public static void main(String[] args) {
            
        jugar();
        
        
        
    }
}
