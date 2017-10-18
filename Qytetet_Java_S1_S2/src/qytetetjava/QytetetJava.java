package qytetetjava;

import java.util.ArrayList;

public class QytetetJava {
     
    static ArrayList<Sorpresa> mazo = new ArrayList();
    private static Tablero tablero = new Tablero();
    
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
    
    private static ArrayList Metodo1(){
        
        ArrayList<Sorpresa> mazo2 = new ArrayList();
        
        for(int i=0; i<mazo.size(); i++){
        
            if(mazo.get(i).valor > 0){
                mazo2.add(mazo.get(i));
            }
        }
        
        return mazo2;
        
    }
    
    private static ArrayList Metodo2(){
        
        ArrayList<Sorpresa> mazo3 = new ArrayList();
        
        for(int i=0; i<mazo.size(); i++){
        
            if(mazo.get(i).tipo == TipoSorpresa.IRACASILLA){
                mazo3.add(mazo.get(i));
            }
        }
        
        return mazo3;
    }
    
    private static ArrayList Metodo3(TipoSorpresa sorpresa){
        
        ArrayList<Sorpresa> mazo4 = new ArrayList();
        
        for(int i=0; i<mazo.size(); i++){
        
            if(mazo.get(i).tipo == sorpresa){
                mazo4.add(mazo.get(i));
            }
        }
        
        return mazo4;
    }
    public static void main(String[] args) {
            
        inicializarSorpresas();
        
        for(int i=0; i<mazo.size(); i++){
        
            System.out.print(mazo.get(i).toString() + "\n");
        }
        
        System.out.print(tablero);
        
        
    }
}
