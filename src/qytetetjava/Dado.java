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

    public static Dado getInstance() {
        return instance;
    }

    int tirar (){
        if(debug)
            return ultimoResultado= 1;
        else
            return ultimoResultado= 1+random.nextInt(6);
    }

    boolean entroEnLaCarcel(){
        int n = tirar();
        boolean x = n==6?true : false;
        return x
    }
    
    boolean salgoDeLaCarcel(){
        int n = tirar();
        boolean x = n >= 5 ? true : false;
        return x;
    }
    
    public int quienEmpieza(int n){
      return random.nextInt(n);
    }
  
    public void setDebug(Boolean d){
      debug = d;
      String e= debug == true ? "Debug-> true":"Debug-> false";
      Diario.getInstance().ocurreEvento(e);
    }
}


/*This person will use the Dice (Dado)   */

public class Person{
  private String name;
  private String surname;
  private int age;

  /*private constructor*/
  private Person(String nname, String ssurname){
    name = nname;
    surname = ssurname;
  }
    
  /*next are getters and setters*/
  public String getFname(){
    return name;
  }
}
