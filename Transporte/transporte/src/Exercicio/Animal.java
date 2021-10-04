package Exercicio;

public class Animal{
     String fala;
     int peso;

    public Animal(String fala, int peso) {
        this.fala = fala;
        this.peso = peso;
    }
    public Animal(String fala) {
        this.fala = fala;
    }

    public Animal() {
    }


    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getFala() {
        return fala;
    }

    public void setFala(String fala) {
        this.fala = fala;
    }

    public void falando(Falar falar){
        this.fala = falar.getFala();
     }




    

  


    
}