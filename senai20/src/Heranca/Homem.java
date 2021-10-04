package Heranca;

public class Homem extends Humano {
    //Humano -> SuperClasse
    //Homem -> SubClasse de Humano
     String biotipo;


    public Homem(String nome, int idade, float peso){
        super(nome, idade, peso);
    }

    public Homem(){
        super();
    }

    @Override
    public void soma(int n1, int n2) {
        super.soma(n1, n2);
    }

    
}
