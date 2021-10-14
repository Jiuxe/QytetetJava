package qytetetjava;

/*For working shock*/

package com.unimongame.attackOld;
import com.unimongame.Unimon;

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




/*Define class*/
public class Shock extends Attack {

	public Shock() {
		super("Im shocking", "wow stop the shock");
	}

   /*Override method*/
	@Override
	public void doAttack(Unimon attacker, Unimon target) {
		target.reduceHp(30);
		target.distract();
	}

}
