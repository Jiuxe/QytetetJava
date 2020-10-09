package qytetetjava;

import java.util.Random;

public class Dado {

    static final private Dado instance = new Dado();
    static final private int SalidaCarcel = 5;
    
    Random random;
    int ultimoResultado;
    boolean debug;
  
    private Dado(){
        ultimoResultado=0;
        random= new Random();
        debug=false;
    }

    int tirar (){
        if(debug)
            return ultimoResultado= 1;
        else
            return ultimoResultado= 1+random.nextInt(6);
    }
}
