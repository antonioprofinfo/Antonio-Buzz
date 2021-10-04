package Heranca;
public abstract class Humano{
    private String nome;
    private int idade;
    private float peso;

    //construtor
    public Humano(String nome, int idade, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
       
    }
    //Subrecarga do construtor
    public Humano() {
    }
    //Emcapsulaamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void soma(int n1, int n2 ){
        System.out.println(n1+n1);
    }

    



    

    

    

    

    










    /*public void escreva(String nome){
        System.out.println("O nome é "+nome);
    }

    public void escreva(int valor){
        System.out.println("O valor é "+ valor);
    }*/

}