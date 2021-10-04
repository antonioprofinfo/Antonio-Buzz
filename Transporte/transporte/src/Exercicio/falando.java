package Exercicio;


public class falando {
    public static void main(String[] args) {
               Homem homen = new Homem("Oi");
               System.out.println(homen.getFala());

               Cachorro cachorro = new Cachorro("Au! Au!", 10);
               System.out.println(cachorro.getFala());

               Gato gato = new Gato("Miau!!!", 10);
               System.out.println(gato.getFala());

               Animal animal = new Animal();
               animal.setFala(homen.fala);
               System.out.println(homen.getFala());

               animal.setFala(cachorro.fala);
               System.out.println(cachorro.getFala());

               animal.setFala(gato.fala);
               System.out.println("O gato disse; " + gato.getFala());

               

    }

}
