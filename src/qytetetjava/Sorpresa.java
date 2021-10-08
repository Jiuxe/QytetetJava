package qytetetjava;

public class Sorpresa {
   
    package String texto;
    package TipoSorpresa tipo;
    package int valor;
    
    public Sorpresa(String texto, int valor, TipoSorpresa tipo){
        this.texto = texto;
        this.valor = valor;
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return "Sorpresa{" + "texto=" + texto + ", valor=" + Integer.toString(valor) + ", tipo=" + tipo + "}";
    }
}
