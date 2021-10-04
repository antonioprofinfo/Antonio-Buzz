package Heranca;


public class Principal {
    public static void main(String[] args) {
        /*Humano  humano = new Humano();
        humano.setNome("Treggi");
        humano.setIdade(25);
        System.out.println("Nome: "+humano.getNome()+"\nIdade: "+humano.getIdade());
        System.out.println(humano.getPeso());*/

        Homem homem = new Homem("Wendel", 20, 50);
        System.out.println("Nome: "+homem.getNome()+ "\nIdade: "+ homem.getIdade()+"\nPeso: "+homem.getPeso());

        homem.soma(2,2);





        //humano.escreva("Victor");
        //humano.escreva(10);
    }
}
